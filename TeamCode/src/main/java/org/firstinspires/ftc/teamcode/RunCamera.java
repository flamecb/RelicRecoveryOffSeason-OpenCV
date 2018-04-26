package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.opencv.android.JavaCameraView;
import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.android.CameraBridgeViewBase.CvCameraViewFrame;
import org.opencv.android.CameraBridgeViewBase.CvCameraViewListener2;
import org.opencv.android.LoaderCallbackInterface;
import org.opencv.android.OpenCVLoader;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.VideoCapture;
import org.opencv.imgproc.Imgproc;
import org.opencv.video.Video;


@Autonomous(name="OpenCV Camera", group="Linear Opmode")
public class RunCamera extends LinearOpMode implements CvCameraViewListener2 {

    public void runOpMode() {
        VideoCapture camera = new VideoCapture();
        camera.open(0);
        //frame = camera.read();
        Mat image = new Mat();
        Mat HSV = new Mat();
        while (opModeIsActive()) {

            if (!camera.isOpened()) {
                while (!camera.isOpened()) {
                    sleep(100);
                    telemetry.addLine("Camera is opening...");
                }
            } else {
                camera.read(image); //read from the camera and return it to image.

                //convert frame from BGR to HSV colorspace
                // Imgproc.cvtColor(image,HSV, Imgproc.COLOR_BGR2HSV );

            }

        }
        camera.release();
    }

    @Override
    public void onCameraViewStarted(int width, int height) {

    }

    @Override
    public void onCameraViewStopped() {

    }

    @Override
    public Mat onCameraFrame(CvCameraViewFrame inputFrame) {
        return null;
    }
}

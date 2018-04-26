package org.firstinspires.ftc.teamcode;

import org.opencv.android.JavaCameraView;
import
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

public class MainLib extends Camera {

    public void initCV() {
    }

    public void setColor (){
    }

//    public Image toBufferedImage(Mat m){
//        int type = BufferedImage.TYPE_BYTE_GRAY;
//        if ( m.channels() > 1 ) {
//            type = BufferedImage.TYPE_3BYTE_BGR;
//        }
//        int bufferSize = m.channels()*m.cols()*m.rows();
//        byte [] b = new byte[bufferSize];
//        m.get(0,0,b); // get all the pixels
//        BufferedImage image = new BufferedImage(m.cols(),m.rows(), type);
//        final byte[] targetPixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
//        System.arraycopy(b, 0, targetPixels, 0, b.length);
//        return image;
//
//    }

    }

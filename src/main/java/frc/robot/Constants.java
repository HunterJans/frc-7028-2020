/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public final class DriveTrain {
        public static final int DEVICE_ID_LEFT_MASTER = 2;
        public static final int DEVICE_ID_LEFT_SLAVE = 0;
        public static final int DEVICE_ID_RIGHT_MASTER = 3;
        public static final int DEVICE_ID_RIGHT_SLAVE = 1;

        private static final double METERS_PER_INCH = 0.0254d;

        public static final int SENSOR_UNITS_PER_ROTATION = 4096;
        public static final double WHEEL_DIAMETER_INCHES = 6d;
        public static final double WHEEL_CIRCUMFERENCE_INCHES = WHEEL_DIAMETER_INCHES * Math.PI;
        public static final double WHEEL_CIRCUMFERENCE_METERS = WHEEL_DIAMETER_INCHES * METERS_PER_INCH * Math.PI;
    }

    public final class Controller {
        public static final int PORT_ID_DRIVER_CONTROLLER = 0;
        public static final int PORT_ID_OPERATOR_CONSOLE = 1;
    }

}

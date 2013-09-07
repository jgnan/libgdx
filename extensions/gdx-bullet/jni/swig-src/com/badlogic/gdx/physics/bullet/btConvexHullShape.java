/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btConvexHullShape extends btPolyhedralConvexAabbCachingShape {
	private long swigCPtr;
	
	protected btConvexHullShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, gdxBulletJNI.btConvexHullShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btConvexHullShape(long cPtr, boolean cMemoryOwn) {
		this("btConvexHullShape", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(btConvexHullShape obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btConvexHullShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  static private long SwigConstructbtConvexHullShape(java.nio.FloatBuffer points, int numPoints, int stride) {
    assert points.isDirect() : "Buffer must be allocated direct.";
    return gdxBulletJNI.new_btConvexHullShape__SWIG_0(points, numPoints, stride);
  }

  public btConvexHullShape(java.nio.FloatBuffer points, int numPoints, int stride) {
    this(btConvexHullShape.SwigConstructbtConvexHullShape(points, numPoints, stride), true);
  }

  static private long SwigConstructbtConvexHullShape(java.nio.FloatBuffer points, int numPoints) {
    assert points.isDirect() : "Buffer must be allocated direct.";
    return gdxBulletJNI.new_btConvexHullShape__SWIG_1(points, numPoints);
  }

  public btConvexHullShape(java.nio.FloatBuffer points, int numPoints) {
    this(btConvexHullShape.SwigConstructbtConvexHullShape(points, numPoints), true);
  }

  static private long SwigConstructbtConvexHullShape(java.nio.FloatBuffer points) {
    assert points.isDirect() : "Buffer must be allocated direct.";
    return gdxBulletJNI.new_btConvexHullShape__SWIG_2(points);
  }

  public btConvexHullShape(java.nio.FloatBuffer points) {
    this(btConvexHullShape.SwigConstructbtConvexHullShape(points), true);
  }

  public btConvexHullShape() {
    this(gdxBulletJNI.new_btConvexHullShape__SWIG_3(), true);
  }

  public void addPoint(Vector3 point) {
    gdxBulletJNI.btConvexHullShape_addPoint(swigCPtr, this, point);
  }

  public btVector3 getUnscaledPoints() {
    long cPtr = gdxBulletJNI.btConvexHullShape_getUnscaledPoints__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public btVector3 getPoints() {
    long cPtr = gdxBulletJNI.btConvexHullShape_getPoints(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public Vector3 getScaledPoint(int i) {
	return gdxBulletJNI.btConvexHullShape_getScaledPoint(swigCPtr, this, i);
}

  public int getNumPoints() {
    return gdxBulletJNI.btConvexHullShape_getNumPoints(swigCPtr, this);
  }

  public void project(Matrix4 trans, Vector3 dir, SWIGTYPE_p_float minProj, SWIGTYPE_p_float maxProj, Vector3 witnesPtMin, Vector3 witnesPtMax) {
    gdxBulletJNI.btConvexHullShape_project(swigCPtr, this, trans, dir, SWIGTYPE_p_float.getCPtr(minProj), SWIGTYPE_p_float.getCPtr(maxProj), witnesPtMin, witnesPtMax);
  }

  public btConvexHullShape(btShapeHull hull) {
    this(gdxBulletJNI.new_btConvexHullShape__SWIG_4(btShapeHull.getCPtr(hull), hull), true);
  }

}

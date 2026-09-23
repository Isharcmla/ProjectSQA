package org.jfree.chart.block;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jfree.chart.block.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.chart.block.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class BorderArrangement_arrangeFF_66150350018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531;
     Object term532;
     Object term586;
     Object term5925;
     Object term5926;
     Object term5935;
     Object term5863;

    public BorderArrangement_arrangeFF_66150350018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term531, term531.getClass(), "centerBlock", null);
        setField(term531, term531.getClass(), "topBlock", null);
        setField(term531, term531.getClass(), "bottomBlock", null);
        setField(term531, term531.getClass(), "leftBlock", null);
        setField(term531, term531.getClass(), "rightBlock", null);
        ArrayList term533 = new ArrayList();
        term532 = newInstance(Class.forName("org.jfree.chart.block.BlockContainer"));
        Object term537 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term550 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term551 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term575 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term576 = newInstance(Class.forName("java.awt.Color"));
        Object term581 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        setField(term532, term532.getClass(), "blocks", term533);
        setField(term537, term537.getClass(), "centerBlock", null);
        setField(term537, term537.getClass(), "topBlock", null);
        setField(term537, term537.getClass(), "bottomBlock", null);
        setField(term537, term537.getClass(), "leftBlock", null);
        setField(term537, term537.getClass(), "rightBlock", null);
        setField(term532, term532.getClass(), "arrangement", term537);
        setField(term532, term532.getClass(), "id", "RMFIsYGgne");
        setField(term551, term551.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term550, term550.getClass(), "unitType", term551);
        setDoubleField(term550, term550.getClass(), "top", 0.0);
        setDoubleField(term550, term550.getClass(), "left", 0.0);
        setDoubleField(term550, term550.getClass(), "bottom", 0.0);
        setDoubleField(term550, term550.getClass(), "right", 0.0);
        setField(term532, term532.getClass(), "margin", term550);
        setField(term575, term575.getClass(), "insets", term550);
        setIntField(term576, term576.getClass(), "value", -1);
        setField(term576, term576.getClass(), "frgbvalue", null);
        setField(term576, term576.getClass(), "fvalue", null);
        setFloatField(term576, term576.getClass(), "falpha", 0.0F);
        setField(term576, term576.getClass(), "cs", null);
        setField(term575, term575.getClass(), "paint", term576);
        setField(term532, term532.getClass(), "frame", term575);
        setField(term532, term532.getClass(), "padding", term550);
        setDoubleField(term532, term532.getClass(), "width", 0.7559240768573477);
        setDoubleField(term532, term532.getClass(), "height", 0.10667076642995188);
        setFloatField(term581, term581.getClass(), "x", 0.0F);
        setFloatField(term581, term581.getClass(), "y", 0.0F);
        setFloatField(term581, term581.getClass(), "width", 0.0F);
        setFloatField(term581, term581.getClass(), "height", 0.0F);
        setField(term532, term532.getClass(), "bounds", term581);
        term586 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        Object term588 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term591 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        Object term605 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term608 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        setDoubleField(term586, term586.getClass(), "width", 0.11493000848982304);
        setDoubleField(term588, term588.getClass(), "lower", 0.37161417339133307);
        setDoubleField(term588, term588.getClass(), "upper", 0.6805867182029153);
        setField(term586, term586.getClass(), "widthRange", term588);
        setField(term591, term591.getClass(), "name", "NRdvgJlhkX");
        setField(term586, term586.getClass(), "widthConstraintType", term591);
        setDoubleField(term586, term586.getClass(), "height", 0.2852810965221698);
        setDoubleField(term605, term605.getClass(), "lower", 0.6300849762307866);
        setDoubleField(term605, term605.getClass(), "upper", 0.9737083944266686);
        setField(term586, term586.getClass(), "heightRange", term605);
        setField(term608, term608.getClass(), "name", "uuaPigETmJ");
        setField(term586, term586.getClass(), "heightConstraintType", term608);
        term5925 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term5925, term5925.getClass(), "centerBlock", null);
        setField(term5925, term5925.getClass(), "topBlock", null);
        setField(term5925, term5925.getClass(), "bottomBlock", null);
        setField(term5925, term5925.getClass(), "leftBlock", null);
        setField(term5925, term5925.getClass(), "rightBlock", null);
        term5926 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        Object term5927 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term5928 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        Object term5931 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term5932 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        setDoubleField(term5926, term5926.getClass(), "width", 0.11493000848982304);
        setDoubleField(term5927, term5927.getClass(), "lower", 0.37161417339133307);
        setDoubleField(term5927, term5927.getClass(), "upper", 0.6805867182029153);
        setField(term5926, term5926.getClass(), "widthRange", term5927);
        setField(term5928, term5928.getClass(), "name", "NRdvgJlhkX");
        setField(term5926, term5926.getClass(), "widthConstraintType", term5928);
        setDoubleField(term5926, term5926.getClass(), "height", 0.2852810965221698);
        setDoubleField(term5931, term5931.getClass(), "lower", 0.6300849762307866);
        setDoubleField(term5931, term5931.getClass(), "upper", 0.9737083944266686);
        setField(term5926, term5926.getClass(), "heightRange", term5931);
        setField(term5932, term5932.getClass(), "name", "uuaPigETmJ");
        setField(term5926, term5926.getClass(), "heightConstraintType", term5932);
        ArrayList term5936 = new ArrayList();
        term5935 = newInstance(Class.forName("org.jfree.chart.block.BlockContainer"));
        Object term5938 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term5941 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term5942 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term5945 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term5946 = newInstance(Class.forName("java.awt.Color"));
        Object term5947 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        setField(term5935, term5935.getClass(), "blocks", term5936);
        setField(term5938, term5938.getClass(), "centerBlock", null);
        setField(term5938, term5938.getClass(), "topBlock", null);
        setField(term5938, term5938.getClass(), "bottomBlock", null);
        setField(term5938, term5938.getClass(), "leftBlock", null);
        setField(term5938, term5938.getClass(), "rightBlock", null);
        setField(term5935, term5935.getClass(), "arrangement", term5938);
        setField(term5935, term5935.getClass(), "id", "RMFIsYGgne");
        setField(term5942, term5942.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term5941, term5941.getClass(), "unitType", term5942);
        setDoubleField(term5941, term5941.getClass(), "top", 0.0);
        setDoubleField(term5941, term5941.getClass(), "left", 0.0);
        setDoubleField(term5941, term5941.getClass(), "bottom", 0.0);
        setDoubleField(term5941, term5941.getClass(), "right", 0.0);
        setField(term5935, term5935.getClass(), "margin", term5941);
        setField(term5945, term5945.getClass(), "insets", term5941);
        setIntField(term5946, term5946.getClass(), "value", -1);
        setField(term5946, term5946.getClass(), "frgbvalue", null);
        setField(term5946, term5946.getClass(), "fvalue", null);
        setFloatField(term5946, term5946.getClass(), "falpha", 0.0F);
        setField(term5946, term5946.getClass(), "cs", null);
        setField(term5945, term5945.getClass(), "paint", term5946);
        setField(term5935, term5935.getClass(), "frame", term5945);
        setField(term5935, term5935.getClass(), "padding", term5941);
        setDoubleField(term5935, term5935.getClass(), "width", 0.7559240768573477);
        setDoubleField(term5935, term5935.getClass(), "height", 0.10667076642995188);
        setFloatField(term5947, term5947.getClass(), "x", 0.0F);
        setFloatField(term5947, term5947.getClass(), "y", 0.0F);
        setFloatField(term5947, term5947.getClass(), "width", 0.0F);
        setFloatField(term5947, term5947.getClass(), "height", 0.0F);
        setField(term5935, term5935.getClass(), "bounds", term5947);
        term5863 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term5863, term5863.getClass(), "width", 0.11493000848982304);
        setDoubleField(term5863, term5863.getClass(), "height", 0.2852810965221698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        argTypes[2] = Class.forName("org.jfree.chart.block.RectangleConstraint");
        Object[] args = new Object[3];
        args[0] = term532;
        args[1] = null;
        args[2] = term586;
        Object retValue = callMethod(klass, "arrangeFF", argTypes, term531, args);
        assertTrue(recursiveEquals(term531, term5925));
        assertTrue(recursiveEquals(term532, term5926));
        assertTrue(recursiveEquals(term586, null));
        assertTrue(recursiveEquals(retValue, term5863));
    }

};



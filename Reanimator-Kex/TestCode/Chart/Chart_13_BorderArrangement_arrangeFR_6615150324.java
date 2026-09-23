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
import java.util.ArrayList;
import java.lang.Object;

public class BorderArrangement_arrangeFR_6615150324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222;
     Object term223;
     Object term277;

    public BorderArrangement_arrangeFR_6615150324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term222, term222.getClass(), "centerBlock", null);
        setField(term222, term222.getClass(), "topBlock", null);
        setField(term222, term222.getClass(), "bottomBlock", null);
        setField(term222, term222.getClass(), "leftBlock", null);
        setField(term222, term222.getClass(), "rightBlock", null);
        ArrayList term224 = new ArrayList();
        term223 = newInstance(Class.forName("org.jfree.chart.block.BlockContainer"));
        Object term228 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term241 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term242 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term266 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term267 = newInstance(Class.forName("java.awt.Color"));
        Object term272 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        setField(term223, term223.getClass(), "blocks", term224);
        setField(term228, term228.getClass(), "centerBlock", null);
        setField(term228, term228.getClass(), "topBlock", null);
        setField(term228, term228.getClass(), "bottomBlock", null);
        setField(term228, term228.getClass(), "leftBlock", null);
        setField(term228, term228.getClass(), "rightBlock", null);
        setField(term223, term223.getClass(), "arrangement", term228);
        setField(term223, term223.getClass(), "id", "jJCZpVmanW");
        setField(term242, term242.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term241, term241.getClass(), "unitType", term242);
        setDoubleField(term241, term241.getClass(), "top", 0.0);
        setDoubleField(term241, term241.getClass(), "left", 0.0);
        setDoubleField(term241, term241.getClass(), "bottom", 0.0);
        setDoubleField(term241, term241.getClass(), "right", 0.0);
        setField(term223, term223.getClass(), "margin", term241);
        setField(term266, term266.getClass(), "insets", term241);
        setIntField(term267, term267.getClass(), "value", -1);
        setField(term267, term267.getClass(), "frgbvalue", null);
        setField(term267, term267.getClass(), "fvalue", null);
        setFloatField(term267, term267.getClass(), "falpha", 0.0F);
        setField(term267, term267.getClass(), "cs", null);
        setField(term266, term266.getClass(), "paint", term267);
        setField(term223, term223.getClass(), "frame", term266);
        setField(term223, term223.getClass(), "padding", term241);
        setDoubleField(term223, term223.getClass(), "width", 0.8474802076607362);
        setDoubleField(term223, term223.getClass(), "height", 0.5183269973490326);
        setFloatField(term272, term272.getClass(), "x", 0.0F);
        setFloatField(term272, term272.getClass(), "y", 0.0F);
        setFloatField(term272, term272.getClass(), "width", 0.0F);
        setFloatField(term272, term272.getClass(), "height", 0.0F);
        setField(term223, term223.getClass(), "bounds", term272);
        term277 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        Object term279 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term282 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        Object term296 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term299 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        setDoubleField(term277, term277.getClass(), "width", 0.7655020693602768);
        setDoubleField(term279, term279.getClass(), "lower", 0.1374549299694151);
        setDoubleField(term279, term279.getClass(), "upper", 0.7031006357544823);
        setField(term277, term277.getClass(), "widthRange", term279);
        setField(term282, term282.getClass(), "name", "EGtDIRbSSb");
        setField(term277, term277.getClass(), "widthConstraintType", term282);
        setDoubleField(term277, term277.getClass(), "height", 0.9527281779865117);
        setDoubleField(term296, term296.getClass(), "lower", 0.9828442029246764);
        setDoubleField(term296, term296.getClass(), "upper", 0.2779719046761513);
        setField(term277, term277.getClass(), "heightRange", term296);
        setField(term299, term299.getClass(), "name", "SzjVpOQTyS");
        setField(term277, term277.getClass(), "heightConstraintType", term299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        argTypes[2] = Class.forName("org.jfree.chart.block.RectangleConstraint");
        Object[] args = new Object[3];
        args[0] = term223;
        args[1] = null;
        args[2] = term277;
        callMethod(klass, "arrangeFR", argTypes, term222, args);
    }

};



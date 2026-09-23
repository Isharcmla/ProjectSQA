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

public class BorderArrangement_arrange_8826141962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term4;
     Object term58;

    public BorderArrangement_arrange_8826141962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term3, term3.getClass(), "centerBlock", null);
        setField(term3, term3.getClass(), "topBlock", null);
        setField(term3, term3.getClass(), "bottomBlock", null);
        setField(term3, term3.getClass(), "leftBlock", null);
        setField(term3, term3.getClass(), "rightBlock", null);
        ArrayList term5 = new ArrayList();
        term4 = newInstance(Class.forName("org.jfree.chart.block.BlockContainer"));
        Object term9 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term22 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term23 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term47 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term48 = newInstance(Class.forName("java.awt.Color"));
        Object term53 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        setField(term4, term4.getClass(), "blocks", term5);
        setField(term9, term9.getClass(), "centerBlock", null);
        setField(term9, term9.getClass(), "topBlock", null);
        setField(term9, term9.getClass(), "bottomBlock", null);
        setField(term9, term9.getClass(), "leftBlock", null);
        setField(term9, term9.getClass(), "rightBlock", null);
        setField(term4, term4.getClass(), "arrangement", term9);
        setField(term4, term4.getClass(), "id", "PAEBtnZtTD");
        setField(term23, term23.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term22, term22.getClass(), "unitType", term23);
        setDoubleField(term22, term22.getClass(), "top", 0.0);
        setDoubleField(term22, term22.getClass(), "left", 0.0);
        setDoubleField(term22, term22.getClass(), "bottom", 0.0);
        setDoubleField(term22, term22.getClass(), "right", 0.0);
        setField(term4, term4.getClass(), "margin", term22);
        setField(term47, term47.getClass(), "insets", term22);
        setIntField(term48, term48.getClass(), "value", -1);
        setField(term48, term48.getClass(), "frgbvalue", null);
        setField(term48, term48.getClass(), "fvalue", null);
        setFloatField(term48, term48.getClass(), "falpha", 0.0F);
        setField(term48, term48.getClass(), "cs", null);
        setField(term47, term47.getClass(), "paint", term48);
        setField(term4, term4.getClass(), "frame", term47);
        setField(term4, term4.getClass(), "padding", term22);
        setDoubleField(term4, term4.getClass(), "width", 0.13238746331190498);
        setDoubleField(term4, term4.getClass(), "height", 0.3455959125047594);
        setFloatField(term53, term53.getClass(), "x", 0.0F);
        setFloatField(term53, term53.getClass(), "y", 0.0F);
        setFloatField(term53, term53.getClass(), "width", 0.0F);
        setFloatField(term53, term53.getClass(), "height", 0.0F);
        setField(term4, term4.getClass(), "bounds", term53);
        term58 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        Object term60 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term63 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        Object term77 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term80 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        setDoubleField(term58, term58.getClass(), "width", 0.5523635872663106);
        setDoubleField(term60, term60.getClass(), "lower", 0.544608645520025);
        setDoubleField(term60, term60.getClass(), "upper", 0.28570734989730284);
        setField(term58, term58.getClass(), "widthRange", term60);
        setField(term63, term63.getClass(), "name", "sjlJAEtRrb");
        setField(term58, term58.getClass(), "widthConstraintType", term63);
        setDoubleField(term58, term58.getClass(), "height", 0.40176586625454525);
        setDoubleField(term77, term77.getClass(), "lower", 0.2641345529914265);
        setDoubleField(term77, term77.getClass(), "upper", 0.36923381893433327);
        setField(term58, term58.getClass(), "heightRange", term77);
        setField(term80, term80.getClass(), "name", "MuLcgQHgqz");
        setField(term58, term58.getClass(), "heightConstraintType", term80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        argTypes[2] = Class.forName("org.jfree.chart.block.RectangleConstraint");
        Object[] args = new Object[3];
        args[0] = term4;
        args[1] = null;
        args[2] = term58;
        callMethod(klass, "arrange", argTypes, term3, args);
    }

};



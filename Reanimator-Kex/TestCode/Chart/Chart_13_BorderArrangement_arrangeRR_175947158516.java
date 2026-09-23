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
import java.lang.IllegalArgumentException;
import static org.jfree.chart.block.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class BorderArrangement_arrangeRR_175947158516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443;
     Object term444;
     Object term498;
     Object term501;

    public BorderArrangement_arrangeRR_175947158516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term443, term443.getClass(), "centerBlock", null);
        setField(term443, term443.getClass(), "topBlock", null);
        setField(term443, term443.getClass(), "bottomBlock", null);
        setField(term443, term443.getClass(), "leftBlock", null);
        setField(term443, term443.getClass(), "rightBlock", null);
        ArrayList term445 = new ArrayList();
        term444 = newInstance(Class.forName("org.jfree.chart.block.BlockContainer"));
        Object term449 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term462 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term463 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term487 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term488 = newInstance(Class.forName("java.awt.Color"));
        Object term493 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        setField(term444, term444.getClass(), "blocks", term445);
        setField(term449, term449.getClass(), "centerBlock", null);
        setField(term449, term449.getClass(), "topBlock", null);
        setField(term449, term449.getClass(), "bottomBlock", null);
        setField(term449, term449.getClass(), "leftBlock", null);
        setField(term449, term449.getClass(), "rightBlock", null);
        setField(term444, term444.getClass(), "arrangement", term449);
        setField(term444, term444.getClass(), "id", "hRNSzYYIrc");
        setField(term463, term463.getClass(), "name", "UnitType.ABSOLUTE");
        setField(term462, term462.getClass(), "unitType", term463);
        setDoubleField(term462, term462.getClass(), "top", 0.0);
        setDoubleField(term462, term462.getClass(), "left", 0.0);
        setDoubleField(term462, term462.getClass(), "bottom", 0.0);
        setDoubleField(term462, term462.getClass(), "right", 0.0);
        setField(term444, term444.getClass(), "margin", term462);
        setField(term487, term487.getClass(), "insets", term462);
        setIntField(term488, term488.getClass(), "value", -1);
        setField(term488, term488.getClass(), "frgbvalue", null);
        setField(term488, term488.getClass(), "fvalue", null);
        setFloatField(term488, term488.getClass(), "falpha", 0.0F);
        setField(term488, term488.getClass(), "cs", null);
        setField(term487, term487.getClass(), "paint", term488);
        setField(term444, term444.getClass(), "frame", term487);
        setField(term444, term444.getClass(), "padding", term462);
        setDoubleField(term444, term444.getClass(), "width", 0.8598297828918529);
        setDoubleField(term444, term444.getClass(), "height", 0.43692187681405226);
        setFloatField(term493, term493.getClass(), "x", 0.0F);
        setFloatField(term493, term493.getClass(), "y", 0.0F);
        setFloatField(term493, term493.getClass(), "width", 0.0F);
        setFloatField(term493, term493.getClass(), "height", 0.0F);
        setField(term444, term444.getClass(), "bounds", term493);
        term498 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term498, term498.getClass(), "lower", 0.7633268466829064);
        setDoubleField(term498, term498.getClass(), "upper", 0.13481025392611334);
        term501 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term501, term501.getClass(), "lower", 0.3800088629986428);
        setDoubleField(term501, term501.getClass(), "upper", 0.5840714198152577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("org.jfree.data.Range");
        argTypes[2] = Class.forName("org.jfree.data.Range");
        argTypes[3] = Class.forName("java.awt.Graphics2D");
        Object[] args = new Object[4];
        args[0] = term444;
        args[1] = term498;
        args[2] = term501;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term443, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



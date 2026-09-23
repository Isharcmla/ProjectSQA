package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseArrayLiteral_67090236439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1758720;
     Object term1758790;

    public TypeInference_traverseArrayLiteral_67090236439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1758720 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1758790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1758860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1758930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1760960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1758860, term1758860.getClass(), "type", 83);
        setIntField(term1758930, term1758930.getClass(), "type", 83);
        setIntField(term1759000, term1759000.getClass(), "type", 83);
        setIntField(term1759070, term1759070.getClass(), "type", 83);
        setIntField(term1759140, term1759140.getClass(), "type", 83);
        setIntField(term1759210, term1759210.getClass(), "type", 83);
        setIntField(term1759280, term1759280.getClass(), "type", 83);
        setIntField(term1759350, term1759350.getClass(), "type", 83);
        setIntField(term1759420, term1759420.getClass(), "type", 83);
        setIntField(term1759490, term1759490.getClass(), "type", 83);
        setIntField(term1759560, term1759560.getClass(), "type", 83);
        setIntField(term1759630, term1759630.getClass(), "type", 83);
        setIntField(term1759700, term1759700.getClass(), "type", 83);
        setIntField(term1759770, term1759770.getClass(), "type", 83);
        setIntField(term1759840, term1759840.getClass(), "type", 83);
        setIntField(term1759910, term1759910.getClass(), "type", 83);
        setIntField(term1759980, term1759980.getClass(), "type", 83);
        setIntField(term1760050, term1760050.getClass(), "type", 83);
        setIntField(term1760120, term1760120.getClass(), "type", 83);
        setIntField(term1760190, term1760190.getClass(), "type", 83);
        setIntField(term1760260, term1760260.getClass(), "type", 83);
        setIntField(term1760330, term1760330.getClass(), "type", 83);
        setIntField(term1760400, term1760400.getClass(), "type", 83);
        setIntField(term1760470, term1760470.getClass(), "type", 83);
        setIntField(term1760540, term1760540.getClass(), "type", 83);
        setIntField(term1760610, term1760610.getClass(), "type", 83);
        setIntField(term1760680, term1760680.getClass(), "type", 83);
        setIntField(term1760750, term1760750.getClass(), "type", 83);
        setIntField(term1760820, term1760820.getClass(), "type", 83);
        setIntField(term1760890, term1760890.getClass(), "type", 83);
        setIntField(term1760960, term1760960.getClass(), "type", 83);
        setIntField(term1761030, term1761030.getClass(), "type", 83);
        setIntField(term1761100, term1761100.getClass(), "type", 83);
        setIntField(term1761170, term1761170.getClass(), "type", 83);
        setIntField(term1761240, term1761240.getClass(), "type", 83);
        setIntField(term1761310, term1761310.getClass(), "type", 83);
        setIntField(term1761380, term1761380.getClass(), "type", 83);
        setIntField(term1761450, term1761450.getClass(), "type", 83);
        setIntField(term1761520, term1761520.getClass(), "type", 83);
        setIntField(term1761590, term1761590.getClass(), "type", 83);
        setIntField(term1761660, term1761660.getClass(), "type", 83);
        setIntField(term1761730, term1761730.getClass(), "type", 83);
        setIntField(term1761800, term1761800.getClass(), "type", 83);
        setIntField(term1761870, term1761870.getClass(), "type", 83);
        setIntField(term1761940, term1761940.getClass(), "type", 83);
        setIntField(term1762010, term1762010.getClass(), "type", 83);
        setIntField(term1762080, term1762080.getClass(), "type", 127);
        setField(term1762010, term1762010.getClass(), "first", term1762080);
        setField(term1761940, term1761940.getClass(), "first", term1762010);
        setField(term1761870, term1761870.getClass(), "first", term1761940);
        setField(term1761800, term1761800.getClass(), "first", term1761870);
        setField(term1761730, term1761730.getClass(), "first", term1761800);
        setField(term1761660, term1761660.getClass(), "first", term1761730);
        setField(term1761590, term1761590.getClass(), "first", term1761660);
        setField(term1761520, term1761520.getClass(), "first", term1761590);
        setField(term1761450, term1761450.getClass(), "first", term1761520);
        setField(term1761380, term1761380.getClass(), "first", term1761450);
        setField(term1761310, term1761310.getClass(), "first", term1761380);
        setField(term1761240, term1761240.getClass(), "first", term1761310);
        setField(term1761170, term1761170.getClass(), "first", term1761240);
        setField(term1761100, term1761100.getClass(), "first", term1761170);
        setField(term1761030, term1761030.getClass(), "first", term1761100);
        setField(term1760960, term1760960.getClass(), "first", term1761030);
        setField(term1760890, term1760890.getClass(), "first", term1760960);
        setField(term1760820, term1760820.getClass(), "first", term1760890);
        setField(term1760750, term1760750.getClass(), "first", term1760820);
        setField(term1760680, term1760680.getClass(), "first", term1760750);
        setField(term1760610, term1760610.getClass(), "first", term1760680);
        setField(term1760540, term1760540.getClass(), "first", term1760610);
        setField(term1760470, term1760470.getClass(), "first", term1760540);
        setField(term1760400, term1760400.getClass(), "first", term1760470);
        setField(term1760330, term1760330.getClass(), "first", term1760400);
        setField(term1760260, term1760260.getClass(), "first", term1760330);
        setField(term1760190, term1760190.getClass(), "first", term1760260);
        setField(term1760120, term1760120.getClass(), "first", term1760190);
        setField(term1760050, term1760050.getClass(), "first", term1760120);
        setField(term1759980, term1759980.getClass(), "first", term1760050);
        setField(term1759910, term1759910.getClass(), "first", term1759980);
        setField(term1759840, term1759840.getClass(), "first", term1759910);
        setField(term1759770, term1759770.getClass(), "first", term1759840);
        setField(term1759700, term1759700.getClass(), "first", term1759770);
        setField(term1759630, term1759630.getClass(), "first", term1759700);
        setField(term1759560, term1759560.getClass(), "first", term1759630);
        setField(term1759490, term1759490.getClass(), "first", term1759560);
        setField(term1759420, term1759420.getClass(), "first", term1759490);
        setField(term1759350, term1759350.getClass(), "first", term1759420);
        setField(term1759280, term1759280.getClass(), "first", term1759350);
        setField(term1759210, term1759210.getClass(), "first", term1759280);
        setField(term1759140, term1759140.getClass(), "first", term1759210);
        setField(term1759070, term1759070.getClass(), "first", term1759140);
        setField(term1759000, term1759000.getClass(), "first", term1759070);
        setField(term1758930, term1758930.getClass(), "first", term1759000);
        setField(term1758860, term1758860.getClass(), "first", term1758930);
        setField(term1758790, term1758790.getClass(), "first", term1758860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1758790;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1758720, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



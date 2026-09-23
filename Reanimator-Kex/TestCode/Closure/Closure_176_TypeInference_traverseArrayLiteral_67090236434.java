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

public class TypeInference_traverseArrayLiteral_67090236434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1710690;
     Object term1710760;

    public TypeInference_traverseArrayLiteral_67090236434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1710690 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1710760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1710830, term1710830.getClass(), "type", 83);
        setIntField(term1710900, term1710900.getClass(), "type", 83);
        setIntField(term1710970, term1710970.getClass(), "type", 83);
        setIntField(term1711040, term1711040.getClass(), "type", 83);
        setIntField(term1711110, term1711110.getClass(), "type", 83);
        setIntField(term1711180, term1711180.getClass(), "type", 83);
        setIntField(term1711250, term1711250.getClass(), "type", 83);
        setIntField(term1711320, term1711320.getClass(), "type", 83);
        setIntField(term1711390, term1711390.getClass(), "type", 83);
        setIntField(term1711460, term1711460.getClass(), "type", 83);
        setIntField(term1711530, term1711530.getClass(), "type", 83);
        setIntField(term1711600, term1711600.getClass(), "type", 83);
        setIntField(term1711670, term1711670.getClass(), "type", 83);
        setIntField(term1711740, term1711740.getClass(), "type", 83);
        setIntField(term1711810, term1711810.getClass(), "type", 83);
        setIntField(term1711880, term1711880.getClass(), "type", 83);
        setIntField(term1711950, term1711950.getClass(), "type", 83);
        setIntField(term1712020, term1712020.getClass(), "type", 83);
        setIntField(term1712090, term1712090.getClass(), "type", 83);
        setIntField(term1712160, term1712160.getClass(), "type", 83);
        setIntField(term1712230, term1712230.getClass(), "type", 83);
        setIntField(term1712300, term1712300.getClass(), "type", 83);
        setIntField(term1712370, term1712370.getClass(), "type", 83);
        setIntField(term1712440, term1712440.getClass(), "type", 83);
        setIntField(term1712510, term1712510.getClass(), "type", 83);
        setIntField(term1712580, term1712580.getClass(), "type", 83);
        setIntField(term1712650, term1712650.getClass(), "type", 83);
        setIntField(term1712720, term1712720.getClass(), "type", 83);
        setIntField(term1712790, term1712790.getClass(), "type", 83);
        setIntField(term1712860, term1712860.getClass(), "type", 83);
        setIntField(term1712930, term1712930.getClass(), "type", 83);
        setIntField(term1713000, term1713000.getClass(), "type", 83);
        setIntField(term1713070, term1713070.getClass(), "type", 83);
        setIntField(term1713140, term1713140.getClass(), "type", 83);
        setIntField(term1713210, term1713210.getClass(), "type", 83);
        setIntField(term1713280, term1713280.getClass(), "type", 83);
        setIntField(term1713350, term1713350.getClass(), "type", 83);
        setIntField(term1713420, term1713420.getClass(), "type", 83);
        setIntField(term1713490, term1713490.getClass(), "type", 83);
        setIntField(term1713560, term1713560.getClass(), "type", 83);
        setIntField(term1713630, term1713630.getClass(), "type", 83);
        setIntField(term1713700, term1713700.getClass(), "type", 83);
        setIntField(term1713770, term1713770.getClass(), "type", 83);
        setIntField(term1713840, term1713840.getClass(), "type", 139);
        setField(term1713770, term1713770.getClass(), "first", term1713840);
        setField(term1713700, term1713700.getClass(), "first", term1713770);
        setField(term1713630, term1713630.getClass(), "first", term1713700);
        setField(term1713560, term1713560.getClass(), "first", term1713630);
        setField(term1713490, term1713490.getClass(), "first", term1713560);
        setField(term1713420, term1713420.getClass(), "first", term1713490);
        setField(term1713350, term1713350.getClass(), "first", term1713420);
        setField(term1713280, term1713280.getClass(), "first", term1713350);
        setField(term1713210, term1713210.getClass(), "first", term1713280);
        setField(term1713140, term1713140.getClass(), "first", term1713210);
        setField(term1713070, term1713070.getClass(), "first", term1713140);
        setField(term1713000, term1713000.getClass(), "first", term1713070);
        setField(term1712930, term1712930.getClass(), "first", term1713000);
        setField(term1712860, term1712860.getClass(), "first", term1712930);
        setField(term1712790, term1712790.getClass(), "first", term1712860);
        setField(term1712720, term1712720.getClass(), "first", term1712790);
        setField(term1712650, term1712650.getClass(), "first", term1712720);
        setField(term1712580, term1712580.getClass(), "first", term1712650);
        setField(term1712510, term1712510.getClass(), "first", term1712580);
        setField(term1712440, term1712440.getClass(), "first", term1712510);
        setField(term1712370, term1712370.getClass(), "first", term1712440);
        setField(term1712300, term1712300.getClass(), "first", term1712370);
        setField(term1712230, term1712230.getClass(), "first", term1712300);
        setField(term1712160, term1712160.getClass(), "first", term1712230);
        setField(term1712090, term1712090.getClass(), "first", term1712160);
        setField(term1712020, term1712020.getClass(), "first", term1712090);
        setField(term1711950, term1711950.getClass(), "first", term1712020);
        setField(term1711880, term1711880.getClass(), "first", term1711950);
        setField(term1711810, term1711810.getClass(), "first", term1711880);
        setField(term1711740, term1711740.getClass(), "first", term1711810);
        setField(term1711670, term1711670.getClass(), "first", term1711740);
        setField(term1711600, term1711600.getClass(), "first", term1711670);
        setField(term1711530, term1711530.getClass(), "first", term1711600);
        setField(term1711460, term1711460.getClass(), "first", term1711530);
        setField(term1711390, term1711390.getClass(), "first", term1711460);
        setField(term1711320, term1711320.getClass(), "first", term1711390);
        setField(term1711250, term1711250.getClass(), "first", term1711320);
        setField(term1711180, term1711180.getClass(), "first", term1711250);
        setField(term1711110, term1711110.getClass(), "first", term1711180);
        setField(term1711040, term1711040.getClass(), "first", term1711110);
        setField(term1710970, term1710970.getClass(), "first", term1711040);
        setField(term1710900, term1710900.getClass(), "first", term1710970);
        setField(term1710830, term1710830.getClass(), "first", term1710900);
        setField(term1710760, term1710760.getClass(), "first", term1710830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1710760;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1710690, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



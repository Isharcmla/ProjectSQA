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

public class TypeInference_traverseAdd_838817955379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term882250;
     Object term882320;

    public TypeInference_traverseAdd_838817955379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term882250 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term882320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term882390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term882460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term882530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term882600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term882670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term882740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term882810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term882880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term882950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term883020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term883090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term883160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term883230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term883300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term883370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term883440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term883510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term883580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term883650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term883720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term883790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term883860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term883930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term884980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term886030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term886100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term886170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term882390, term882390.getClass(), "next", null);
        setIntField(term882390, term882390.getClass(), "type", 14);
        setIntField(term882460, term882460.getClass(), "type", 14);
        setIntField(term882530, term882530.getClass(), "type", 14);
        setIntField(term882600, term882600.getClass(), "type", 14);
        setIntField(term882670, term882670.getClass(), "type", 14);
        setIntField(term882740, term882740.getClass(), "type", 14);
        setIntField(term882810, term882810.getClass(), "type", 14);
        setIntField(term882880, term882880.getClass(), "type", 14);
        setIntField(term882950, term882950.getClass(), "type", 14);
        setIntField(term883020, term883020.getClass(), "type", 14);
        setIntField(term883090, term883090.getClass(), "type", 14);
        setIntField(term883160, term883160.getClass(), "type", 14);
        setIntField(term883230, term883230.getClass(), "type", 14);
        setIntField(term883300, term883300.getClass(), "type", 14);
        setIntField(term883370, term883370.getClass(), "type", 14);
        setIntField(term883440, term883440.getClass(), "type", 14);
        setIntField(term883510, term883510.getClass(), "type", 14);
        setIntField(term883580, term883580.getClass(), "type", 14);
        setIntField(term883650, term883650.getClass(), "type", 14);
        setIntField(term883720, term883720.getClass(), "type", 14);
        setIntField(term883790, term883790.getClass(), "type", 14);
        setIntField(term883860, term883860.getClass(), "type", 14);
        setIntField(term883930, term883930.getClass(), "type", 14);
        setIntField(term884000, term884000.getClass(), "type", 14);
        setIntField(term884070, term884070.getClass(), "type", 14);
        setIntField(term884140, term884140.getClass(), "type", 14);
        setIntField(term884210, term884210.getClass(), "type", 14);
        setIntField(term884280, term884280.getClass(), "type", 14);
        setIntField(term884350, term884350.getClass(), "type", 14);
        setIntField(term884420, term884420.getClass(), "type", 14);
        setIntField(term884490, term884490.getClass(), "type", 14);
        setIntField(term884560, term884560.getClass(), "type", 14);
        setIntField(term884630, term884630.getClass(), "type", 14);
        setIntField(term884700, term884700.getClass(), "type", 14);
        setIntField(term884770, term884770.getClass(), "type", 14);
        setIntField(term884840, term884840.getClass(), "type", 14);
        setIntField(term884910, term884910.getClass(), "type", 14);
        setIntField(term884980, term884980.getClass(), "type", 14);
        setIntField(term885050, term885050.getClass(), "type", 14);
        setIntField(term885120, term885120.getClass(), "type", 14);
        setIntField(term885190, term885190.getClass(), "type", 14);
        setIntField(term885260, term885260.getClass(), "type", 14);
        setIntField(term885330, term885330.getClass(), "type", 14);
        setIntField(term885400, term885400.getClass(), "type", 14);
        setIntField(term885470, term885470.getClass(), "type", 14);
        setIntField(term885540, term885540.getClass(), "type", 14);
        setIntField(term885610, term885610.getClass(), "type", 14);
        setIntField(term885680, term885680.getClass(), "type", 14);
        setIntField(term885750, term885750.getClass(), "type", 14);
        setIntField(term885820, term885820.getClass(), "type", 14);
        setIntField(term885890, term885890.getClass(), "type", 14);
        setIntField(term885960, term885960.getClass(), "type", 14);
        setIntField(term886030, term886030.getClass(), "type", 14);
        setIntField(term886100, term886100.getClass(), "type", 14);
        setIntField(term886170, term886170.getClass(), "type", 119);
        setField(term886100, term886100.getClass(), "first", term886170);
        setField(term886030, term886030.getClass(), "first", term886100);
        setField(term885960, term885960.getClass(), "first", term886030);
        setField(term885890, term885890.getClass(), "first", term885960);
        setField(term885820, term885820.getClass(), "first", term885890);
        setField(term885750, term885750.getClass(), "first", term885820);
        setField(term885680, term885680.getClass(), "first", term885750);
        setField(term885610, term885610.getClass(), "first", term885680);
        setField(term885540, term885540.getClass(), "first", term885610);
        setField(term885470, term885470.getClass(), "first", term885540);
        setField(term885400, term885400.getClass(), "first", term885470);
        setField(term885330, term885330.getClass(), "first", term885400);
        setField(term885260, term885260.getClass(), "first", term885330);
        setField(term885190, term885190.getClass(), "first", term885260);
        setField(term885120, term885120.getClass(), "first", term885190);
        setField(term885050, term885050.getClass(), "first", term885120);
        setField(term884980, term884980.getClass(), "first", term885050);
        setField(term884910, term884910.getClass(), "first", term884980);
        setField(term884840, term884840.getClass(), "first", term884910);
        setField(term884770, term884770.getClass(), "first", term884840);
        setField(term884700, term884700.getClass(), "first", term884770);
        setField(term884630, term884630.getClass(), "first", term884700);
        setField(term884560, term884560.getClass(), "first", term884630);
        setField(term884490, term884490.getClass(), "first", term884560);
        setField(term884420, term884420.getClass(), "first", term884490);
        setField(term884350, term884350.getClass(), "first", term884420);
        setField(term884280, term884280.getClass(), "first", term884350);
        setField(term884210, term884210.getClass(), "first", term884280);
        setField(term884140, term884140.getClass(), "first", term884210);
        setField(term884070, term884070.getClass(), "first", term884140);
        setField(term884000, term884000.getClass(), "first", term884070);
        setField(term883930, term883930.getClass(), "first", term884000);
        setField(term883860, term883860.getClass(), "first", term883930);
        setField(term883790, term883790.getClass(), "first", term883860);
        setField(term883720, term883720.getClass(), "first", term883790);
        setField(term883650, term883650.getClass(), "first", term883720);
        setField(term883580, term883580.getClass(), "first", term883650);
        setField(term883510, term883510.getClass(), "first", term883580);
        setField(term883440, term883440.getClass(), "first", term883510);
        setField(term883370, term883370.getClass(), "first", term883440);
        setField(term883300, term883300.getClass(), "first", term883370);
        setField(term883230, term883230.getClass(), "first", term883300);
        setField(term883160, term883160.getClass(), "first", term883230);
        setField(term883090, term883090.getClass(), "first", term883160);
        setField(term883020, term883020.getClass(), "first", term883090);
        setField(term882950, term882950.getClass(), "first", term883020);
        setField(term882880, term882880.getClass(), "first", term882950);
        setField(term882810, term882810.getClass(), "first", term882880);
        setField(term882740, term882740.getClass(), "first", term882810);
        setField(term882670, term882670.getClass(), "first", term882740);
        setField(term882600, term882600.getClass(), "first", term882670);
        setField(term882530, term882530.getClass(), "first", term882600);
        setField(term882460, term882460.getClass(), "first", term882530);
        setField(term882390, term882390.getClass(), "first", term882460);
        setField(term882320, term882320.getClass(), "first", term882390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term882320;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term882250, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



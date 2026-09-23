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

public class TypeInference_traverseChildren_1478920219260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460560;
     Object term460630;

    public TypeInference_traverseChildren_1478920219260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term460560 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term460630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term460700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term460770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term460840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term460910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term460980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term462030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term462100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term462170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term462240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term462310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term462380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term462450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term462520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term462590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term462660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term462730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term462800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term462870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term462940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term464060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term464130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term464200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term464270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term464340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term464410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term464480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term464550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term464620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term464690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term464760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term464830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term464900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term460700, term460700.getClass(), "type", 18);
        setIntField(term460770, term460770.getClass(), "type", 18);
        setIntField(term460840, term460840.getClass(), "type", 18);
        setIntField(term460910, term460910.getClass(), "type", 18);
        setIntField(term460980, term460980.getClass(), "type", 18);
        setIntField(term461050, term461050.getClass(), "type", 18);
        setIntField(term461120, term461120.getClass(), "type", 18);
        setIntField(term461190, term461190.getClass(), "type", 18);
        setIntField(term461260, term461260.getClass(), "type", 18);
        setIntField(term461330, term461330.getClass(), "type", 18);
        setIntField(term461400, term461400.getClass(), "type", 18);
        setIntField(term461470, term461470.getClass(), "type", 18);
        setIntField(term461540, term461540.getClass(), "type", 18);
        setIntField(term461610, term461610.getClass(), "type", 18);
        setIntField(term461680, term461680.getClass(), "type", 18);
        setIntField(term461750, term461750.getClass(), "type", 18);
        setIntField(term461820, term461820.getClass(), "type", 18);
        setIntField(term461890, term461890.getClass(), "type", 18);
        setIntField(term461960, term461960.getClass(), "type", 18);
        setIntField(term462030, term462030.getClass(), "type", 18);
        setIntField(term462100, term462100.getClass(), "type", 18);
        setIntField(term462170, term462170.getClass(), "type", 18);
        setIntField(term462240, term462240.getClass(), "type", 18);
        setIntField(term462310, term462310.getClass(), "type", 18);
        setIntField(term462380, term462380.getClass(), "type", 18);
        setIntField(term462450, term462450.getClass(), "type", 18);
        setIntField(term462520, term462520.getClass(), "type", 18);
        setIntField(term462590, term462590.getClass(), "type", 18);
        setIntField(term462660, term462660.getClass(), "type", 18);
        setIntField(term462730, term462730.getClass(), "type", 18);
        setIntField(term462800, term462800.getClass(), "type", 18);
        setIntField(term462870, term462870.getClass(), "type", 18);
        setIntField(term462940, term462940.getClass(), "type", 18);
        setIntField(term463010, term463010.getClass(), "type", 18);
        setIntField(term463080, term463080.getClass(), "type", 18);
        setIntField(term463150, term463150.getClass(), "type", 18);
        setIntField(term463220, term463220.getClass(), "type", 18);
        setIntField(term463290, term463290.getClass(), "type", 18);
        setIntField(term463360, term463360.getClass(), "type", 18);
        setIntField(term463430, term463430.getClass(), "type", 18);
        setIntField(term463500, term463500.getClass(), "type", 18);
        setIntField(term463570, term463570.getClass(), "type", 18);
        setIntField(term463640, term463640.getClass(), "type", 18);
        setIntField(term463710, term463710.getClass(), "type", 18);
        setIntField(term463780, term463780.getClass(), "type", 18);
        setIntField(term463850, term463850.getClass(), "type", 18);
        setIntField(term463920, term463920.getClass(), "type", 18);
        setIntField(term463990, term463990.getClass(), "type", 18);
        setIntField(term464060, term464060.getClass(), "type", 18);
        setIntField(term464130, term464130.getClass(), "type", 18);
        setIntField(term464200, term464200.getClass(), "type", 18);
        setIntField(term464270, term464270.getClass(), "type", 18);
        setIntField(term464340, term464340.getClass(), "type", 18);
        setIntField(term464410, term464410.getClass(), "type", 18);
        setIntField(term464480, term464480.getClass(), "type", 18);
        setIntField(term464550, term464550.getClass(), "type", 18);
        setIntField(term464620, term464620.getClass(), "type", 18);
        setIntField(term464690, term464690.getClass(), "type", 18);
        setIntField(term464760, term464760.getClass(), "type", 18);
        setIntField(term464830, term464830.getClass(), "type", 18);
        setIntField(term464900, term464900.getClass(), "type", 26);
        setField(term464830, term464830.getClass(), "first", term464900);
        setField(term464760, term464760.getClass(), "first", term464830);
        setField(term464690, term464690.getClass(), "first", term464760);
        setField(term464620, term464620.getClass(), "first", term464690);
        setField(term464550, term464550.getClass(), "first", term464620);
        setField(term464480, term464480.getClass(), "first", term464550);
        setField(term464410, term464410.getClass(), "first", term464480);
        setField(term464340, term464340.getClass(), "first", term464410);
        setField(term464270, term464270.getClass(), "first", term464340);
        setField(term464200, term464200.getClass(), "first", term464270);
        setField(term464130, term464130.getClass(), "first", term464200);
        setField(term464060, term464060.getClass(), "first", term464130);
        setField(term463990, term463990.getClass(), "first", term464060);
        setField(term463920, term463920.getClass(), "first", term463990);
        setField(term463850, term463850.getClass(), "first", term463920);
        setField(term463780, term463780.getClass(), "first", term463850);
        setField(term463710, term463710.getClass(), "first", term463780);
        setField(term463640, term463640.getClass(), "first", term463710);
        setField(term463570, term463570.getClass(), "first", term463640);
        setField(term463500, term463500.getClass(), "first", term463570);
        setField(term463430, term463430.getClass(), "first", term463500);
        setField(term463360, term463360.getClass(), "first", term463430);
        setField(term463290, term463290.getClass(), "first", term463360);
        setField(term463220, term463220.getClass(), "first", term463290);
        setField(term463150, term463150.getClass(), "first", term463220);
        setField(term463080, term463080.getClass(), "first", term463150);
        setField(term463010, term463010.getClass(), "first", term463080);
        setField(term462940, term462940.getClass(), "first", term463010);
        setField(term462870, term462870.getClass(), "first", term462940);
        setField(term462800, term462800.getClass(), "first", term462870);
        setField(term462730, term462730.getClass(), "first", term462800);
        setField(term462660, term462660.getClass(), "first", term462730);
        setField(term462590, term462590.getClass(), "first", term462660);
        setField(term462520, term462520.getClass(), "first", term462590);
        setField(term462450, term462450.getClass(), "first", term462520);
        setField(term462380, term462380.getClass(), "first", term462450);
        setField(term462310, term462310.getClass(), "first", term462380);
        setField(term462240, term462240.getClass(), "first", term462310);
        setField(term462170, term462170.getClass(), "first", term462240);
        setField(term462100, term462100.getClass(), "first", term462170);
        setField(term462030, term462030.getClass(), "first", term462100);
        setField(term461960, term461960.getClass(), "first", term462030);
        setField(term461890, term461890.getClass(), "first", term461960);
        setField(term461820, term461820.getClass(), "first", term461890);
        setField(term461750, term461750.getClass(), "first", term461820);
        setField(term461680, term461680.getClass(), "first", term461750);
        setField(term461610, term461610.getClass(), "first", term461680);
        setField(term461540, term461540.getClass(), "first", term461610);
        setField(term461470, term461470.getClass(), "first", term461540);
        setField(term461400, term461400.getClass(), "first", term461470);
        setField(term461330, term461330.getClass(), "first", term461400);
        setField(term461260, term461260.getClass(), "first", term461330);
        setField(term461190, term461190.getClass(), "first", term461260);
        setField(term461120, term461120.getClass(), "first", term461190);
        setField(term461050, term461050.getClass(), "first", term461120);
        setField(term460980, term460980.getClass(), "first", term461050);
        setField(term460910, term460910.getClass(), "first", term460980);
        setField(term460840, term460840.getClass(), "first", term460910);
        setField(term460770, term460770.getClass(), "first", term460840);
        setField(term460700, term460700.getClass(), "first", term460770);
        setField(term460630, term460630.getClass(), "first", term460700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term460630;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term460560, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



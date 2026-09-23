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

public class TypeInference_traverseReturn_1142297770281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term522970;
     Object term523040;

    public TypeInference_traverseReturn_1142297770281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term522970 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term523040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term523110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term523180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term523250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term523320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term523390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term523460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term523530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term523600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term523670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term523740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term523810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term523880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term523950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term523110, term523110.getClass(), "type", 29);
        setIntField(term523180, term523180.getClass(), "type", 29);
        setIntField(term523250, term523250.getClass(), "type", 29);
        setIntField(term523320, term523320.getClass(), "type", 29);
        setIntField(term523390, term523390.getClass(), "type", 29);
        setIntField(term523460, term523460.getClass(), "type", 29);
        setIntField(term523530, term523530.getClass(), "type", 29);
        setIntField(term523600, term523600.getClass(), "type", 29);
        setIntField(term523670, term523670.getClass(), "type", 29);
        setIntField(term523740, term523740.getClass(), "type", 29);
        setIntField(term523810, term523810.getClass(), "type", 29);
        setIntField(term523880, term523880.getClass(), "type", 29);
        setIntField(term523950, term523950.getClass(), "type", 29);
        setIntField(term524020, term524020.getClass(), "type", 29);
        setIntField(term524090, term524090.getClass(), "type", 29);
        setIntField(term524160, term524160.getClass(), "type", 29);
        setIntField(term524230, term524230.getClass(), "type", 29);
        setIntField(term524300, term524300.getClass(), "type", 29);
        setIntField(term524370, term524370.getClass(), "type", 29);
        setIntField(term524440, term524440.getClass(), "type", 29);
        setIntField(term524510, term524510.getClass(), "type", 29);
        setIntField(term524580, term524580.getClass(), "type", 29);
        setIntField(term524650, term524650.getClass(), "type", 29);
        setIntField(term524720, term524720.getClass(), "type", 29);
        setIntField(term524790, term524790.getClass(), "type", 29);
        setIntField(term524860, term524860.getClass(), "type", 29);
        setIntField(term524930, term524930.getClass(), "type", 29);
        setIntField(term525000, term525000.getClass(), "type", 29);
        setIntField(term525070, term525070.getClass(), "type", 29);
        setIntField(term525140, term525140.getClass(), "type", 29);
        setIntField(term525210, term525210.getClass(), "type", 29);
        setIntField(term525280, term525280.getClass(), "type", 29);
        setIntField(term525350, term525350.getClass(), "type", 29);
        setIntField(term525420, term525420.getClass(), "type", 29);
        setIntField(term525490, term525490.getClass(), "type", 29);
        setIntField(term525560, term525560.getClass(), "type", 29);
        setIntField(term525630, term525630.getClass(), "type", 29);
        setIntField(term525700, term525700.getClass(), "type", 29);
        setIntField(term525770, term525770.getClass(), "type", 29);
        setIntField(term525840, term525840.getClass(), "type", 29);
        setIntField(term525910, term525910.getClass(), "type", 29);
        setIntField(term525980, term525980.getClass(), "type", 29);
        setIntField(term526050, term526050.getClass(), "type", 29);
        setIntField(term526120, term526120.getClass(), "type", 29);
        setIntField(term526190, term526190.getClass(), "type", 29);
        setIntField(term526260, term526260.getClass(), "type", 29);
        setIntField(term526330, term526330.getClass(), "type", 29);
        setIntField(term526400, term526400.getClass(), "type", 29);
        setIntField(term526470, term526470.getClass(), "type", 29);
        setIntField(term526540, term526540.getClass(), "type", 29);
        setIntField(term526610, term526610.getClass(), "type", 29);
        setIntField(term526680, term526680.getClass(), "type", 29);
        setIntField(term526750, term526750.getClass(), "type", 29);
        setIntField(term526820, term526820.getClass(), "type", 29);
        setIntField(term526890, term526890.getClass(), "type", 29);
        setIntField(term526960, term526960.getClass(), "type", 29);
        setIntField(term527030, term527030.getClass(), "type", 29);
        setIntField(term527100, term527100.getClass(), "type", 29);
        setIntField(term527170, term527170.getClass(), "type", 29);
        setIntField(term527240, term527240.getClass(), "type", 29);
        setIntField(term527310, term527310.getClass(), "type", 29);
        setIntField(term527380, term527380.getClass(), "type", 29);
        setIntField(term527450, term527450.getClass(), "type", 29);
        setIntField(term527520, term527520.getClass(), "type", 29);
        setIntField(term527590, term527590.getClass(), "type", 29);
        setIntField(term527660, term527660.getClass(), "type", 144);
        setField(term527590, term527590.getClass(), "first", term527660);
        setField(term527520, term527520.getClass(), "first", term527590);
        setField(term527450, term527450.getClass(), "first", term527520);
        setField(term527380, term527380.getClass(), "first", term527450);
        setField(term527310, term527310.getClass(), "first", term527380);
        setField(term527240, term527240.getClass(), "first", term527310);
        setField(term527170, term527170.getClass(), "first", term527240);
        setField(term527100, term527100.getClass(), "first", term527170);
        setField(term527030, term527030.getClass(), "first", term527100);
        setField(term526960, term526960.getClass(), "first", term527030);
        setField(term526890, term526890.getClass(), "first", term526960);
        setField(term526820, term526820.getClass(), "first", term526890);
        setField(term526750, term526750.getClass(), "first", term526820);
        setField(term526680, term526680.getClass(), "first", term526750);
        setField(term526610, term526610.getClass(), "first", term526680);
        setField(term526540, term526540.getClass(), "first", term526610);
        setField(term526470, term526470.getClass(), "first", term526540);
        setField(term526400, term526400.getClass(), "first", term526470);
        setField(term526330, term526330.getClass(), "first", term526400);
        setField(term526260, term526260.getClass(), "first", term526330);
        setField(term526190, term526190.getClass(), "first", term526260);
        setField(term526120, term526120.getClass(), "first", term526190);
        setField(term526050, term526050.getClass(), "first", term526120);
        setField(term525980, term525980.getClass(), "first", term526050);
        setField(term525910, term525910.getClass(), "first", term525980);
        setField(term525840, term525840.getClass(), "first", term525910);
        setField(term525770, term525770.getClass(), "first", term525840);
        setField(term525700, term525700.getClass(), "first", term525770);
        setField(term525630, term525630.getClass(), "first", term525700);
        setField(term525560, term525560.getClass(), "first", term525630);
        setField(term525490, term525490.getClass(), "first", term525560);
        setField(term525420, term525420.getClass(), "first", term525490);
        setField(term525350, term525350.getClass(), "first", term525420);
        setField(term525280, term525280.getClass(), "first", term525350);
        setField(term525210, term525210.getClass(), "first", term525280);
        setField(term525140, term525140.getClass(), "first", term525210);
        setField(term525070, term525070.getClass(), "first", term525140);
        setField(term525000, term525000.getClass(), "first", term525070);
        setField(term524930, term524930.getClass(), "first", term525000);
        setField(term524860, term524860.getClass(), "first", term524930);
        setField(term524790, term524790.getClass(), "first", term524860);
        setField(term524720, term524720.getClass(), "first", term524790);
        setField(term524650, term524650.getClass(), "first", term524720);
        setField(term524580, term524580.getClass(), "first", term524650);
        setField(term524510, term524510.getClass(), "first", term524580);
        setField(term524440, term524440.getClass(), "first", term524510);
        setField(term524370, term524370.getClass(), "first", term524440);
        setField(term524300, term524300.getClass(), "first", term524370);
        setField(term524230, term524230.getClass(), "first", term524300);
        setField(term524160, term524160.getClass(), "first", term524230);
        setField(term524090, term524090.getClass(), "first", term524160);
        setField(term524020, term524020.getClass(), "first", term524090);
        setField(term523950, term523950.getClass(), "first", term524020);
        setField(term523880, term523880.getClass(), "first", term523950);
        setField(term523810, term523810.getClass(), "first", term523880);
        setField(term523740, term523740.getClass(), "first", term523810);
        setField(term523670, term523670.getClass(), "first", term523740);
        setField(term523600, term523600.getClass(), "first", term523670);
        setField(term523530, term523530.getClass(), "first", term523600);
        setField(term523460, term523460.getClass(), "first", term523530);
        setField(term523390, term523390.getClass(), "first", term523460);
        setField(term523320, term523320.getClass(), "first", term523390);
        setField(term523250, term523250.getClass(), "first", term523320);
        setField(term523180, term523180.getClass(), "first", term523250);
        setField(term523110, term523110.getClass(), "first", term523180);
        setField(term523040, term523040.getClass(), "first", term523110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term523040;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term522970, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



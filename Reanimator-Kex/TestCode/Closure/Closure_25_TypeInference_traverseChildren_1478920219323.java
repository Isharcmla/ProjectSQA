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

public class TypeInference_traverseChildren_1478920219323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term787840;
     Object term787910;

    public TypeInference_traverseChildren_1478920219323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term787840 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term787910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term787980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term788050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term788120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term788190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term788260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term788330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term788400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term788470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term788540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term788610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term788680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term788750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term788820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term788890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term788960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term787980, term787980.getClass(), "type", 18);
        setIntField(term788050, term788050.getClass(), "type", 18);
        setIntField(term788120, term788120.getClass(), "type", 18);
        setIntField(term788190, term788190.getClass(), "type", 18);
        setIntField(term788260, term788260.getClass(), "type", 18);
        setIntField(term788330, term788330.getClass(), "type", 18);
        setIntField(term788400, term788400.getClass(), "type", 18);
        setIntField(term788470, term788470.getClass(), "type", 18);
        setIntField(term788540, term788540.getClass(), "type", 18);
        setIntField(term788610, term788610.getClass(), "type", 18);
        setIntField(term788680, term788680.getClass(), "type", 18);
        setIntField(term788750, term788750.getClass(), "type", 18);
        setIntField(term788820, term788820.getClass(), "type", 18);
        setIntField(term788890, term788890.getClass(), "type", 18);
        setIntField(term788960, term788960.getClass(), "type", 18);
        setIntField(term789030, term789030.getClass(), "type", 18);
        setIntField(term789100, term789100.getClass(), "type", 18);
        setIntField(term789170, term789170.getClass(), "type", 18);
        setIntField(term789240, term789240.getClass(), "type", 18);
        setIntField(term789310, term789310.getClass(), "type", 18);
        setIntField(term789380, term789380.getClass(), "type", 18);
        setIntField(term789450, term789450.getClass(), "type", 18);
        setIntField(term789520, term789520.getClass(), "type", 18);
        setIntField(term789590, term789590.getClass(), "type", 18);
        setIntField(term789660, term789660.getClass(), "type", 18);
        setIntField(term789730, term789730.getClass(), "type", 18);
        setIntField(term789800, term789800.getClass(), "type", 18);
        setIntField(term789870, term789870.getClass(), "type", 18);
        setIntField(term789940, term789940.getClass(), "type", 46);
        setField(term789870, term789870.getClass(), "first", term789940);
        setField(term789800, term789800.getClass(), "first", term789870);
        setField(term789730, term789730.getClass(), "first", term789800);
        setField(term789660, term789660.getClass(), "first", term789730);
        setField(term789590, term789590.getClass(), "first", term789660);
        setField(term789520, term789520.getClass(), "first", term789590);
        setField(term789450, term789450.getClass(), "first", term789520);
        setField(term789380, term789380.getClass(), "first", term789450);
        setField(term789310, term789310.getClass(), "first", term789380);
        setField(term789240, term789240.getClass(), "first", term789310);
        setField(term789170, term789170.getClass(), "first", term789240);
        setField(term789100, term789100.getClass(), "first", term789170);
        setField(term789030, term789030.getClass(), "first", term789100);
        setField(term788960, term788960.getClass(), "first", term789030);
        setField(term788890, term788890.getClass(), "first", term788960);
        setField(term788820, term788820.getClass(), "first", term788890);
        setField(term788750, term788750.getClass(), "first", term788820);
        setField(term788680, term788680.getClass(), "first", term788750);
        setField(term788610, term788610.getClass(), "first", term788680);
        setField(term788540, term788540.getClass(), "first", term788610);
        setField(term788470, term788470.getClass(), "first", term788540);
        setField(term788400, term788400.getClass(), "first", term788470);
        setField(term788330, term788330.getClass(), "first", term788400);
        setField(term788260, term788260.getClass(), "first", term788330);
        setField(term788190, term788190.getClass(), "first", term788260);
        setField(term788120, term788120.getClass(), "first", term788190);
        setField(term788050, term788050.getClass(), "first", term788120);
        setField(term787980, term787980.getClass(), "first", term788050);
        setField(term787910, term787910.getClass(), "first", term787980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term787910;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term787840, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class TypeInference_traverseReturn_1142297770327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term735120;
     Object term735190;

    public TypeInference_traverseReturn_1142297770327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term735120 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term735190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term736030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term736100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term736170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term736240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term736310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term736380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term736450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term736520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term736590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term736660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term736730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term735260, term735260.getClass(), "type", 29);
        setIntField(term735330, term735330.getClass(), "type", 29);
        setIntField(term735400, term735400.getClass(), "type", 29);
        setIntField(term735470, term735470.getClass(), "type", 29);
        setIntField(term735540, term735540.getClass(), "type", 29);
        setIntField(term735610, term735610.getClass(), "type", 29);
        setIntField(term735680, term735680.getClass(), "type", 29);
        setIntField(term735750, term735750.getClass(), "type", 29);
        setIntField(term735820, term735820.getClass(), "type", 29);
        setIntField(term735890, term735890.getClass(), "type", 29);
        setIntField(term735960, term735960.getClass(), "type", 29);
        setIntField(term736030, term736030.getClass(), "type", 29);
        setIntField(term736100, term736100.getClass(), "type", 29);
        setIntField(term736170, term736170.getClass(), "type", 29);
        setIntField(term736240, term736240.getClass(), "type", 29);
        setIntField(term736310, term736310.getClass(), "type", 29);
        setIntField(term736380, term736380.getClass(), "type", 29);
        setIntField(term736450, term736450.getClass(), "type", 29);
        setIntField(term736520, term736520.getClass(), "type", 29);
        setIntField(term736590, term736590.getClass(), "type", 29);
        setIntField(term736660, term736660.getClass(), "type", 29);
        setIntField(term736730, term736730.getClass(), "type", 148);
        setField(term736660, term736660.getClass(), "first", term736730);
        setField(term736590, term736590.getClass(), "first", term736660);
        setField(term736520, term736520.getClass(), "first", term736590);
        setField(term736450, term736450.getClass(), "first", term736520);
        setField(term736380, term736380.getClass(), "first", term736450);
        setField(term736310, term736310.getClass(), "first", term736380);
        setField(term736240, term736240.getClass(), "first", term736310);
        setField(term736170, term736170.getClass(), "first", term736240);
        setField(term736100, term736100.getClass(), "first", term736170);
        setField(term736030, term736030.getClass(), "first", term736100);
        setField(term735960, term735960.getClass(), "first", term736030);
        setField(term735890, term735890.getClass(), "first", term735960);
        setField(term735820, term735820.getClass(), "first", term735890);
        setField(term735750, term735750.getClass(), "first", term735820);
        setField(term735680, term735680.getClass(), "first", term735750);
        setField(term735610, term735610.getClass(), "first", term735680);
        setField(term735540, term735540.getClass(), "first", term735610);
        setField(term735470, term735470.getClass(), "first", term735540);
        setField(term735400, term735400.getClass(), "first", term735470);
        setField(term735330, term735330.getClass(), "first", term735400);
        setField(term735260, term735260.getClass(), "first", term735330);
        setField(term735190, term735190.getClass(), "first", term735260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term735190;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term735120, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



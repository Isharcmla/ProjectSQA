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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseAdd_1886586883170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206120;
     Object term206190;

    public TypeInference_traverseAdd_1886586883170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206120 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term206190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term207940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term206260, term206260.getClass(), "next", term206330);
        setIntField(term206260, term206260.getClass(), "type", 4);
        setIntField(term206400, term206400.getClass(), "type", 4);
        setIntField(term206470, term206470.getClass(), "type", 4);
        setIntField(term206540, term206540.getClass(), "type", 4);
        setIntField(term206610, term206610.getClass(), "type", 4);
        setIntField(term206680, term206680.getClass(), "type", 4);
        setIntField(term206750, term206750.getClass(), "type", 4);
        setIntField(term206820, term206820.getClass(), "type", 4);
        setIntField(term206890, term206890.getClass(), "type", 4);
        setIntField(term206960, term206960.getClass(), "type", 4);
        setIntField(term207030, term207030.getClass(), "type", 4);
        setIntField(term207100, term207100.getClass(), "type", 4);
        setIntField(term207170, term207170.getClass(), "type", 4);
        setIntField(term207240, term207240.getClass(), "type", 4);
        setIntField(term207310, term207310.getClass(), "type", 4);
        setIntField(term207380, term207380.getClass(), "type", 4);
        setIntField(term207450, term207450.getClass(), "type", 4);
        setIntField(term207520, term207520.getClass(), "type", 4);
        setIntField(term207590, term207590.getClass(), "type", 4);
        setIntField(term207660, term207660.getClass(), "type", 4);
        setIntField(term207730, term207730.getClass(), "type", 4);
        setIntField(term207800, term207800.getClass(), "type", 4);
        setIntField(term207870, term207870.getClass(), "type", 4);
        setIntField(term207940, term207940.getClass(), "type", 114);
        setField(term207870, term207870.getClass(), "first", term207940);
        setField(term207800, term207800.getClass(), "first", term207870);
        setField(term207730, term207730.getClass(), "first", term207800);
        setField(term207660, term207660.getClass(), "first", term207730);
        setField(term207590, term207590.getClass(), "first", term207660);
        setField(term207520, term207520.getClass(), "first", term207590);
        setField(term207450, term207450.getClass(), "first", term207520);
        setField(term207380, term207380.getClass(), "first", term207450);
        setField(term207310, term207310.getClass(), "first", term207380);
        setField(term207240, term207240.getClass(), "first", term207310);
        setField(term207170, term207170.getClass(), "first", term207240);
        setField(term207100, term207100.getClass(), "first", term207170);
        setField(term207030, term207030.getClass(), "first", term207100);
        setField(term206960, term206960.getClass(), "first", term207030);
        setField(term206890, term206890.getClass(), "first", term206960);
        setField(term206820, term206820.getClass(), "first", term206890);
        setField(term206750, term206750.getClass(), "first", term206820);
        setField(term206680, term206680.getClass(), "first", term206750);
        setField(term206610, term206610.getClass(), "first", term206680);
        setField(term206540, term206540.getClass(), "first", term206610);
        setField(term206470, term206470.getClass(), "first", term206540);
        setField(term206400, term206400.getClass(), "first", term206470);
        setField(term206260, term206260.getClass(), "first", term206400);
        setField(term206190, term206190.getClass(), "first", term206260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term206190;
        args[1] = null;
        callMethod(klass, "traverseAdd", argTypes, term206120, args);
    }

};



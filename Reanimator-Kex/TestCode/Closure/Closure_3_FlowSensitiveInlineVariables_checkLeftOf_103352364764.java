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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16370;
     Object term16580;
     Object term16686;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term16440, term16440.getClass(), "parent", term16440);
        setIntField(term16510, term16510.getClass(), "type", 4);
        setField(term16440, term16440.getClass(), "first", term16510);
        setField(term16370, term16370.getClass(), "parent", term16440);
        term16580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term16686 = newInstance(Class.forName("com.google.javascript.jscomp.SideEffectsAnalysis$2"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term16370;
        args[1] = term16580;
        args[2] = term16686;
        callMethod(klass, "checkLeftOf", argTypes, null, args);
    }

};



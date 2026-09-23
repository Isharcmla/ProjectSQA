package com.google.javascript.jscomp.parsing;

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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IRFactory_setFileOverviewJsDoc_1930902895375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43833;
     Object term44149;

    public IRFactory_setFileOverviewJsDoc_1930902895375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43833 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term43903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43999 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term44079 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term43999, term43999.getClass(), "type", 29);
        setField(term43999, term43999.getClass(), "objectValue", term44079);
        setField(term43903, term43903.getClass(), "propListHead", term43999);
        setField(term43833, term43833.getClass(), "rootNodeJsDocHolder", term43903);
        term44149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44149;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term43833, args);
    }

};



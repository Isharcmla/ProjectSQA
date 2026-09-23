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

public class IRFactory_setFileOverviewJsDoc_1930902895364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41405;
     Object term41721;

    public IRFactory_setFileOverviewJsDoc_1930902895364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41405 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term41475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41571 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term41651 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term41571, term41571.getClass(), "type", 29);
        setField(term41571, term41571.getClass(), "objectValue", null);
        setField(term41475, term41475.getClass(), "propListHead", term41571);
        setField(term41405, term41405.getClass(), "rootNodeJsDocHolder", term41475);
        setField(term41405, term41405.getClass(), "fileOverviewInfo", term41651);
        term41721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41817 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term41817, term41817.getClass(), "type", 29);
        setField(term41817, term41817.getClass(), "next", term41817);
        setField(term41721, term41721.getClass(), "propListHead", term41817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41721;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term41405, args);
    }

};



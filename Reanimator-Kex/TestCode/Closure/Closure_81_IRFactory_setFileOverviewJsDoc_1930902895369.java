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

public class IRFactory_setFileOverviewJsDoc_1930902895369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42675;
     Object term42911;

    public IRFactory_setFileOverviewJsDoc_1930902895369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42675 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term42745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42841 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term42841, term42841.getClass(), "type", -30);
        setField(term42841, term42841.getClass(), "next", null);
        setField(term42745, term42745.getClass(), "propListHead", term42841);
        setField(term42675, term42675.getClass(), "rootNodeJsDocHolder", term42745);
        term42911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43007 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term43007, term43007.getClass(), "type", 29);
        setField(term42911, term42911.getClass(), "propListHead", term43007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42911;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term42675, args);
    }

};



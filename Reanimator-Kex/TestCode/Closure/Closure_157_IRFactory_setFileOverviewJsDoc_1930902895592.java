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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IRFactory_setFileOverviewJsDoc_1930902895592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122517;
     Object term122929;

    public IRFactory_setFileOverviewJsDoc_1930902895592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122517 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term122587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122683 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term122779 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term122859 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term122683, term122683.getClass(), "type", -1966645351);
        setIntField(term122779, term122779.getClass(), "type", 29);
        setField(term122779, term122779.getClass(), "objectValue", null);
        setField(term122683, term122683.getClass(), "next", term122779);
        setField(term122587, term122587.getClass(), "propListHead", term122683);
        setField(term122517, term122517.getClass(), "rootNodeJsDocHolder", term122587);
        setField(term122517, term122517.getClass(), "fileOverviewInfo", term122859);
        term122929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123025 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term123121 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term123219 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setIntField(term123025, term123025.getClass(), "type", 1161338982);
        setIntField(term123121, term123121.getClass(), "type", 29);
        setField(term123121, term123121.getClass(), "next", term123121);
        setField(term123121, term123121.getClass(), "objectValue", term123219);
        setField(term123025, term123025.getClass(), "next", term123121);
        setField(term122929, term122929.getClass(), "propListHead", term123025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term122929;
        try {
            callMethod(klass, "setFileOverviewJsDoc", argTypes, term122517, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



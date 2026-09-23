package org.apache.commons.cli;

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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Option_getArgName_35020759863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1798;
     Object term7779;

    public Option_getArgName_35020759863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1851 = new ArrayList();
        term1798 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1850 = newInstance(Class.forName("java.lang.Object"));
        setField(term1798, term1798.getClass(), "opt", "HqBOwkVqjD");
        setField(term1798, term1798.getClass(), "longOpt", "MAcUBcBckh");
        setField(term1798, term1798.getClass(), "argName", "oVgzLbrsFr");
        setField(term1798, term1798.getClass(), "description", "vQVyKLdtaz");
        setBooleanField(term1798, term1798.getClass(), "required", true);
        setBooleanField(term1798, term1798.getClass(), "optionalArg", true);
        setIntField(term1798, term1798.getClass(), "numberOfArgs", -1685132342);
        setField(term1798, term1798.getClass(), "type", term1850);
        setField(term1798, term1798.getClass(), "values", term1851);
        setCharField(term1798, term1798.getClass(), "valuesep", 't');
        ArrayList term7789 = new ArrayList();
        term7779 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term7788 = newInstance(Class.forName("java.lang.Object"));
        setField(term7779, term7779.getClass(), "opt", "HqBOwkVqjD");
        setField(term7779, term7779.getClass(), "longOpt", "MAcUBcBckh");
        setField(term7779, term7779.getClass(), "argName", "oVgzLbrsFr");
        setField(term7779, term7779.getClass(), "description", "vQVyKLdtaz");
        setBooleanField(term7779, term7779.getClass(), "required", true);
        setBooleanField(term7779, term7779.getClass(), "optionalArg", true);
        setIntField(term7779, term7779.getClass(), "numberOfArgs", -1685132342);
        setField(term7779, term7779.getClass(), "type", term7788);
        setField(term7779, term7779.getClass(), "values", term7789);
        setCharField(term7779, term7779.getClass(), "valuesep", 't');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArgName", argTypes, term1798, args);
        assertTrue(recursiveEquals(term1798, term7779));
        assertTrue(recursiveEquals(retValue, "oVgzLbrsFr"));
    }

};



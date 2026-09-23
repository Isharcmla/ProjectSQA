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
import java.util.ArrayList;

public class Option_getArgName_35020759863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1781;
     Object term7612;

    public Option_getArgName_35020759863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1833 = new ArrayList();
        term1781 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1781, term1781.getClass(), "opt", "HqBOwkVqjD");
        setField(term1781, term1781.getClass(), "longOpt", "MAcUBcBckh");
        setField(term1781, term1781.getClass(), "argName", "oVgzLbrsFr");
        setField(term1781, term1781.getClass(), "description", "vQVyKLdtaz");
        setBooleanField(term1781, term1781.getClass(), "required", true);
        setBooleanField(term1781, term1781.getClass(), "optionalArg", true);
        setIntField(term1781, term1781.getClass(), "numberOfArgs", -1685132342);
        setField(term1781, term1781.getClass(), "type", null);
        setField(term1781, term1781.getClass(), "values", term1833);
        setCharField(term1781, term1781.getClass(), "valuesep", 't');
        ArrayList term7621 = new ArrayList();
        term7612 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term7612, term7612.getClass(), "opt", "HqBOwkVqjD");
        setField(term7612, term7612.getClass(), "longOpt", "MAcUBcBckh");
        setField(term7612, term7612.getClass(), "argName", "oVgzLbrsFr");
        setField(term7612, term7612.getClass(), "description", "vQVyKLdtaz");
        setBooleanField(term7612, term7612.getClass(), "required", true);
        setBooleanField(term7612, term7612.getClass(), "optionalArg", true);
        setIntField(term7612, term7612.getClass(), "numberOfArgs", -1685132342);
        setField(term7612, term7612.getClass(), "type", null);
        setField(term7612, term7612.getClass(), "values", term7621);
        setCharField(term7612, term7612.getClass(), "valuesep", 't');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArgName", argTypes, term1781, args);
        assertTrue(recursiveEquals(term1781, term7612));
        assertTrue(recursiveEquals(retValue, "oVgzLbrsFr"));
    }

};



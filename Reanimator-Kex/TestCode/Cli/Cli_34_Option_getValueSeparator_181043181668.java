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

public class Option_getValueSeparator_181043181668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2270;
     Object term8312;

    public Option_getValueSeparator_181043181668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2322 = new ArrayList();
        term2270 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2270, term2270.getClass(), "opt", "jiKYgYHqIS");
        setField(term2270, term2270.getClass(), "longOpt", "DfISiziTgG");
        setField(term2270, term2270.getClass(), "argName", "XqgfKFvPSD");
        setField(term2270, term2270.getClass(), "description", "JiVRgTZvKc");
        setBooleanField(term2270, term2270.getClass(), "required", true);
        setBooleanField(term2270, term2270.getClass(), "optionalArg", true);
        setIntField(term2270, term2270.getClass(), "numberOfArgs", -2068769794);
        setField(term2270, term2270.getClass(), "type", null);
        setField(term2270, term2270.getClass(), "values", term2322);
        setCharField(term2270, term2270.getClass(), "valuesep", 'L');
        ArrayList term8321 = new ArrayList();
        term8312 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term8312, term8312.getClass(), "opt", "jiKYgYHqIS");
        setField(term8312, term8312.getClass(), "longOpt", "DfISiziTgG");
        setField(term8312, term8312.getClass(), "argName", "XqgfKFvPSD");
        setField(term8312, term8312.getClass(), "description", "JiVRgTZvKc");
        setBooleanField(term8312, term8312.getClass(), "required", true);
        setBooleanField(term8312, term8312.getClass(), "optionalArg", true);
        setIntField(term8312, term8312.getClass(), "numberOfArgs", -2068769794);
        setField(term8312, term8312.getClass(), "type", null);
        setField(term8312, term8312.getClass(), "values", term8321);
        setCharField(term8312, term8312.getClass(), "valuesep", 'L');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValueSeparator", argTypes, term2270, args);
        assertTrue(recursiveEquals(term2270, term8312));
        assertTrue(recursiveEquals(retValue, 'L'));
    }

};



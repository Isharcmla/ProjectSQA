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

public class Option_getValueSeparator_181043181668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2292;
     Object term8428;

    public Option_getValueSeparator_181043181668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2345 = new ArrayList();
        term2292 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2344 = newInstance(Class.forName("java.lang.Object"));
        setField(term2292, term2292.getClass(), "opt", "jiKYgYHqIS");
        setField(term2292, term2292.getClass(), "longOpt", "DfISiziTgG");
        setField(term2292, term2292.getClass(), "argName", "XqgfKFvPSD");
        setField(term2292, term2292.getClass(), "description", "JiVRgTZvKc");
        setBooleanField(term2292, term2292.getClass(), "required", true);
        setBooleanField(term2292, term2292.getClass(), "optionalArg", true);
        setIntField(term2292, term2292.getClass(), "numberOfArgs", -2068769794);
        setField(term2292, term2292.getClass(), "type", term2344);
        setField(term2292, term2292.getClass(), "values", term2345);
        setCharField(term2292, term2292.getClass(), "valuesep", 'L');
        ArrayList term8438 = new ArrayList();
        term8428 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term8437 = newInstance(Class.forName("java.lang.Object"));
        setField(term8428, term8428.getClass(), "opt", "jiKYgYHqIS");
        setField(term8428, term8428.getClass(), "longOpt", "DfISiziTgG");
        setField(term8428, term8428.getClass(), "argName", "XqgfKFvPSD");
        setField(term8428, term8428.getClass(), "description", "JiVRgTZvKc");
        setBooleanField(term8428, term8428.getClass(), "required", true);
        setBooleanField(term8428, term8428.getClass(), "optionalArg", true);
        setIntField(term8428, term8428.getClass(), "numberOfArgs", -2068769794);
        setField(term8428, term8428.getClass(), "type", term8437);
        setField(term8428, term8428.getClass(), "values", term8438);
        setCharField(term8428, term8428.getClass(), "valuesep", 'L');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValueSeparator", argTypes, term2292, args);
        assertTrue(recursiveEquals(term2292, term8428));
        assertTrue(recursiveEquals(retValue, 'L'));
    }

};



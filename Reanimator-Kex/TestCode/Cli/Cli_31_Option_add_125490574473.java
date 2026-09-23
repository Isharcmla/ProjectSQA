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

public class Option_add_125490574473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2826;
     Object term9856;

    public Option_add_125490574473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2879 = new ArrayList();
        term2826 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2878 = newInstance(Class.forName("java.lang.Object"));
        setField(term2826, term2826.getClass(), "opt", "iNwOJRBEjp");
        setField(term2826, term2826.getClass(), "longOpt", "XylxrMBraH");
        setField(term2826, term2826.getClass(), "argName", "pORebkoRdD");
        setField(term2826, term2826.getClass(), "description", "mXGCWJDOqA");
        setBooleanField(term2826, term2826.getClass(), "required", false);
        setBooleanField(term2826, term2826.getClass(), "optionalArg", true);
        setIntField(term2826, term2826.getClass(), "numberOfArgs", 865208305);
        setField(term2826, term2826.getClass(), "type", term2878);
        setField(term2826, term2826.getClass(), "values", term2879);
        setCharField(term2826, term2826.getClass(), "valuesep", 'g');
        ArrayList term9866 = new ArrayList();
        ((ArrayList) term9866).add("dpNsDgfPso");
        term9856 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term9865 = newInstance(Class.forName("java.lang.Object"));
        setField(term9856, term9856.getClass(), "opt", "iNwOJRBEjp");
        setField(term9856, term9856.getClass(), "longOpt", "XylxrMBraH");
        setField(term9856, term9856.getClass(), "argName", "pORebkoRdD");
        setField(term9856, term9856.getClass(), "description", "mXGCWJDOqA");
        setBooleanField(term9856, term9856.getClass(), "required", false);
        setBooleanField(term9856, term9856.getClass(), "optionalArg", true);
        setIntField(term9856, term9856.getClass(), "numberOfArgs", 865208305);
        setField(term9856, term9856.getClass(), "type", term9865);
        setField(term9856, term9856.getClass(), "values", term9866);
        setCharField(term9856, term9856.getClass(), "valuesep", 'g');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dpNsDgfPso";
        callMethod(klass, "add", argTypes, term2826, args);
        assertTrue(recursiveEquals(term2826, term9856));
    }

};



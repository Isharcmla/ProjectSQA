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

public class Option_getArgs_159741262570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2488;
     Object term8944;

    public Option_getArgs_159741262570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2541 = new ArrayList();
        term2488 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2540 = newInstance(Class.forName("java.lang.Object"));
        setField(term2488, term2488.getClass(), "opt", "AWRooQKkdW");
        setField(term2488, term2488.getClass(), "longOpt", "vjxIhXHxGR");
        setField(term2488, term2488.getClass(), "argName", "QXzGXbEXMu");
        setField(term2488, term2488.getClass(), "description", "qxSDVejjiY");
        setBooleanField(term2488, term2488.getClass(), "required", false);
        setBooleanField(term2488, term2488.getClass(), "optionalArg", false);
        setIntField(term2488, term2488.getClass(), "numberOfArgs", -1007160944);
        setField(term2488, term2488.getClass(), "type", term2540);
        setField(term2488, term2488.getClass(), "values", term2541);
        setCharField(term2488, term2488.getClass(), "valuesep", 'g');
        ArrayList term8954 = new ArrayList();
        term8944 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term8953 = newInstance(Class.forName("java.lang.Object"));
        setField(term8944, term8944.getClass(), "opt", "AWRooQKkdW");
        setField(term8944, term8944.getClass(), "longOpt", "vjxIhXHxGR");
        setField(term8944, term8944.getClass(), "argName", "QXzGXbEXMu");
        setField(term8944, term8944.getClass(), "description", "qxSDVejjiY");
        setBooleanField(term8944, term8944.getClass(), "required", false);
        setBooleanField(term8944, term8944.getClass(), "optionalArg", false);
        setIntField(term8944, term8944.getClass(), "numberOfArgs", -1007160944);
        setField(term8944, term8944.getClass(), "type", term8953);
        setField(term8944, term8944.getClass(), "values", term8954);
        setCharField(term8944, term8944.getClass(), "valuesep", 'g');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArgs", argTypes, term2488, args);
        assertTrue(recursiveEquals(term2488, term8944));
        assertTrue(recursiveEquals(retValue, -1007160944));
    }

};



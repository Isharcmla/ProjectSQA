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

public class Option_getArgs_159741262570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2464;
     Object term8826;

    public Option_getArgs_159741262570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2516 = new ArrayList();
        term2464 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2464, term2464.getClass(), "opt", "AWRooQKkdW");
        setField(term2464, term2464.getClass(), "longOpt", "vjxIhXHxGR");
        setField(term2464, term2464.getClass(), "argName", "QXzGXbEXMu");
        setField(term2464, term2464.getClass(), "description", "qxSDVejjiY");
        setBooleanField(term2464, term2464.getClass(), "required", false);
        setBooleanField(term2464, term2464.getClass(), "optionalArg", false);
        setIntField(term2464, term2464.getClass(), "numberOfArgs", -1007160944);
        setField(term2464, term2464.getClass(), "type", null);
        setField(term2464, term2464.getClass(), "values", term2516);
        setCharField(term2464, term2464.getClass(), "valuesep", 'g');
        ArrayList term8835 = new ArrayList();
        term8826 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term8826, term8826.getClass(), "opt", "AWRooQKkdW");
        setField(term8826, term8826.getClass(), "longOpt", "vjxIhXHxGR");
        setField(term8826, term8826.getClass(), "argName", "QXzGXbEXMu");
        setField(term8826, term8826.getClass(), "description", "qxSDVejjiY");
        setBooleanField(term8826, term8826.getClass(), "required", false);
        setBooleanField(term8826, term8826.getClass(), "optionalArg", false);
        setIntField(term8826, term8826.getClass(), "numberOfArgs", -1007160944);
        setField(term8826, term8826.getClass(), "type", null);
        setField(term8826, term8826.getClass(), "values", term8835);
        setCharField(term8826, term8826.getClass(), "valuesep", 'g');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArgs", argTypes, term2464, args);
        assertTrue(recursiveEquals(term2464, term8826));
        assertTrue(recursiveEquals(retValue, -1007160944));
    }

};



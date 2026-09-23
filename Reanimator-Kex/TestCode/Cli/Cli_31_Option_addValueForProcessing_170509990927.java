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
import java.lang.Object;
import java.util.ArrayList;

public class Option_addValueForProcessing_170509990927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2586;

    public Option_addValueForProcessing_170509990927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2639 = new ArrayList();
        term2586 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2638 = newInstance(Class.forName("java.lang.Object"));
        setField(term2586, term2586.getClass(), "opt", "xBsXSDjXYK");
        setField(term2586, term2586.getClass(), "longOpt", "sEnIVFtZuQ");
        setField(term2586, term2586.getClass(), "argName", "ZVecLZMLHF");
        setField(term2586, term2586.getClass(), "description", "fztQhjqwdP");
        setBooleanField(term2586, term2586.getClass(), "required", true);
        setBooleanField(term2586, term2586.getClass(), "optionalArg", false);
        setIntField(term2586, term2586.getClass(), "numberOfArgs", 1135664017);
        setField(term2586, term2586.getClass(), "type", term2638);
        setField(term2586, term2586.getClass(), "values", term2639);
        setCharField(term2586, term2586.getClass(), "valuesep", 'Q');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eVpkWxjuki";
        callMethod(klass, "addValueForProcessing", argTypes, term2586, args);
    }

};



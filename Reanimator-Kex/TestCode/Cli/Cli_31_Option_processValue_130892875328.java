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

public class Option_processValue_130892875328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2706;

    public Option_processValue_130892875328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2759 = new ArrayList();
        term2706 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2758 = newInstance(Class.forName("java.lang.Object"));
        setField(term2706, term2706.getClass(), "opt", "SJiQaLvSKv");
        setField(term2706, term2706.getClass(), "longOpt", "OEXDRUKcFl");
        setField(term2706, term2706.getClass(), "argName", "RYdKCNNMBR");
        setField(term2706, term2706.getClass(), "description", "yGtHPyvYiQ");
        setBooleanField(term2706, term2706.getClass(), "required", true);
        setBooleanField(term2706, term2706.getClass(), "optionalArg", false);
        setIntField(term2706, term2706.getClass(), "numberOfArgs", 590364439);
        setField(term2706, term2706.getClass(), "type", term2758);
        setField(term2706, term2706.getClass(), "values", term2759);
        setCharField(term2706, term2706.getClass(), "valuesep", 'H');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MvRIxilFMJ";
        callMethod(klass, "processValue", argTypes, term2706, args);
    }

};



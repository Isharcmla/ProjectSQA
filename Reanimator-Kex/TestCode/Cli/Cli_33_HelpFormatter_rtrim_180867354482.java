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

public class HelpFormatter_rtrim_180867354482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34736;

    public HelpFormatter_rtrim_180867354482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34736 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term34736, term34736.getClass(), "defaultWidth", 0);
        setIntField(term34736, term34736.getClass(), "defaultLeftPad", 0);
        setIntField(term34736, term34736.getClass(), "defaultDescPad", 0);
        setField(term34736, term34736.getClass(), "defaultSyntaxPrefix", null);
        setField(term34736, term34736.getClass(), "defaultNewLine", null);
        setField(term34736, term34736.getClass(), "defaultOptPrefix", null);
        setField(term34736, term34736.getClass(), "defaultLongOptPrefix", null);
        setField(term34736, term34736.getClass(), "longOptSeparator", null);
        setField(term34736, term34736.getClass(), "defaultArgName", null);
        setField(term34736, term34736.getClass(), "optionComparator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "rtrim", argTypes, term34736, args);
    }

};



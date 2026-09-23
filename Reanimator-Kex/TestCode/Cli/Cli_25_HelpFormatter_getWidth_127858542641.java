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

public class HelpFormatter_getWidth_127858542641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46;
     Object term5743;

    public HelpFormatter_getWidth_127858542641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term74 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term46, term46.getClass(), "defaultWidth", 74);
        setIntField(term46, term46.getClass(), "defaultLeftPad", 1);
        setIntField(term46, term46.getClass(), "defaultDescPad", 3);
        setField(term46, term46.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term46, term46.getClass(), "defaultNewLine", "\n");
        setField(term46, term46.getClass(), "defaultOptPrefix", "-");
        setField(term46, term46.getClass(), "defaultLongOptPrefix", "--");
        setField(term46, term46.getClass(), "defaultArgName", "arg");
        setField(term46, term46.getClass(), "optionComparator", term74);
        term5743 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term5754 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term5743, term5743.getClass(), "defaultWidth", 74);
        setIntField(term5743, term5743.getClass(), "defaultLeftPad", 1);
        setIntField(term5743, term5743.getClass(), "defaultDescPad", 3);
        setField(term5743, term5743.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5743, term5743.getClass(), "defaultNewLine", "\n");
        setField(term5743, term5743.getClass(), "defaultOptPrefix", "-");
        setField(term5743, term5743.getClass(), "defaultLongOptPrefix", "--");
        setField(term5743, term5743.getClass(), "defaultArgName", "arg");
        setField(term5743, term5743.getClass(), "optionComparator", term5754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getWidth", argTypes, term46, args);
        assertTrue(recursiveEquals(term46, term5743));
        assertTrue(recursiveEquals(retValue, 74));
    }

};



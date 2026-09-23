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

public class HelpFormatter_getOptPrefix_190454114251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546;
     Object term6604;

    public HelpFormatter_getOptPrefix_190454114251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term546 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term574 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term546, term546.getClass(), "defaultWidth", 74);
        setIntField(term546, term546.getClass(), "defaultLeftPad", 1);
        setIntField(term546, term546.getClass(), "defaultDescPad", 3);
        setField(term546, term546.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term546, term546.getClass(), "defaultNewLine", "\n");
        setField(term546, term546.getClass(), "defaultOptPrefix", "-");
        setField(term546, term546.getClass(), "defaultLongOptPrefix", "--");
        setField(term546, term546.getClass(), "defaultArgName", "arg");
        setField(term546, term546.getClass(), "optionComparator", term574);
        term6604 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6615 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6604, term6604.getClass(), "defaultWidth", 74);
        setIntField(term6604, term6604.getClass(), "defaultLeftPad", 1);
        setIntField(term6604, term6604.getClass(), "defaultDescPad", 3);
        setField(term6604, term6604.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6604, term6604.getClass(), "defaultNewLine", "\n");
        setField(term6604, term6604.getClass(), "defaultOptPrefix", "-");
        setField(term6604, term6604.getClass(), "defaultLongOptPrefix", "--");
        setField(term6604, term6604.getClass(), "defaultArgName", "arg");
        setField(term6604, term6604.getClass(), "optionComparator", term6615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptPrefix", argTypes, term546, args);
        assertTrue(recursiveEquals(term546, term6604));
        assertTrue(recursiveEquals(retValue, "-"));
    }

};



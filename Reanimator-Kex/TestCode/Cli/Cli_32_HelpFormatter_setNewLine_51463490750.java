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

public class HelpFormatter_setNewLine_51463490750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405;
     Object term6683;

    public HelpFormatter_setNewLine_51463490750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term436 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term405, term405.getClass(), "defaultWidth", 74);
        setIntField(term405, term405.getClass(), "defaultLeftPad", 1);
        setIntField(term405, term405.getClass(), "defaultDescPad", 3);
        setField(term405, term405.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term405, term405.getClass(), "defaultNewLine", "\n");
        setField(term405, term405.getClass(), "defaultOptPrefix", "-");
        setField(term405, term405.getClass(), "defaultLongOptPrefix", "--");
        setField(term405, term405.getClass(), "longOptSeparator", " ");
        setField(term405, term405.getClass(), "defaultArgName", "arg");
        setField(term405, term405.getClass(), "optionComparator", term436);
        term6683 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6696 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6683, term6683.getClass(), "defaultWidth", 74);
        setIntField(term6683, term6683.getClass(), "defaultLeftPad", 1);
        setIntField(term6683, term6683.getClass(), "defaultDescPad", 3);
        setField(term6683, term6683.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6683, term6683.getClass(), "defaultNewLine", "sjlJAEtRrb");
        setField(term6683, term6683.getClass(), "defaultOptPrefix", "-");
        setField(term6683, term6683.getClass(), "defaultLongOptPrefix", "--");
        setField(term6683, term6683.getClass(), "longOptSeparator", " ");
        setField(term6683, term6683.getClass(), "defaultArgName", "arg");
        setField(term6683, term6683.getClass(), "optionComparator", term6696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sjlJAEtRrb";
        callMethod(klass, "setNewLine", argTypes, term405, args);
        assertTrue(recursiveEquals(term405, term6683));
    }

};



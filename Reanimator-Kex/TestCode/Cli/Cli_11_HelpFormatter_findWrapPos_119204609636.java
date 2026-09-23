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
import java.lang.Integer;

public class HelpFormatter_findWrapPos_119204609636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5408;
     Object term5449;
     Object term5451;

    public HelpFormatter_findWrapPos_119204609636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5408 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term5436 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term5408, term5408.getClass(), "defaultWidth", 74);
        setIntField(term5408, term5408.getClass(), "defaultLeftPad", 1);
        setIntField(term5408, term5408.getClass(), "defaultDescPad", 3);
        setField(term5408, term5408.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5408, term5408.getClass(), "defaultNewLine", "\n");
        setField(term5408, term5408.getClass(), "defaultOptPrefix", "-");
        setField(term5408, term5408.getClass(), "defaultLongOptPrefix", "--");
        setField(term5408, term5408.getClass(), "defaultArgName", "arg");
        setField(term5408, term5408.getClass(), "optionComparator", term5436);
        term5449 = new Integer(-157887805);
        term5451 = new Integer(1876565163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "JDswTTCZHV";
        args[1] = term5449;
        args[2] = term5451;
        callMethod(klass, "findWrapPos", argTypes, term5408, args);
    }

};



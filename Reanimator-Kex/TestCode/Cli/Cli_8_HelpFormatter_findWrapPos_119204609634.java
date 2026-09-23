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
import java.lang.Integer;

public class HelpFormatter_findWrapPos_119204609634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5248;
     Object term5288;
     Object term5290;

    public HelpFormatter_findWrapPos_119204609634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5248 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term5248, term5248.getClass(), "defaultWidth", 74);
        setIntField(term5248, term5248.getClass(), "defaultLeftPad", 1);
        setIntField(term5248, term5248.getClass(), "defaultDescPad", 3);
        setField(term5248, term5248.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5248, term5248.getClass(), "defaultNewLine", "\n");
        setField(term5248, term5248.getClass(), "defaultOptPrefix", "-");
        setField(term5248, term5248.getClass(), "defaultLongOptPrefix", "--");
        setField(term5248, term5248.getClass(), "defaultArgName", "arg");
        term5288 = new Integer(-157887805);
        term5290 = new Integer(1876565163);
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
        args[1] = term5288;
        args[2] = term5290;
        callMethod(klass, "findWrapPos", argTypes, term5248, args);
    }

};



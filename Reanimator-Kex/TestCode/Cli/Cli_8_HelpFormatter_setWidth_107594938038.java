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
import java.lang.Integer;

public class HelpFormatter_setWidth_107594938038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term29;
     Object term5506;

    public HelpFormatter_setWidth_107594938038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term1, term1.getClass(), "defaultWidth", 74);
        setIntField(term1, term1.getClass(), "defaultLeftPad", 1);
        setIntField(term1, term1.getClass(), "defaultDescPad", 3);
        setField(term1, term1.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term1, term1.getClass(), "defaultNewLine", "\n");
        setField(term1, term1.getClass(), "defaultOptPrefix", "-");
        setField(term1, term1.getClass(), "defaultLongOptPrefix", "--");
        setField(term1, term1.getClass(), "defaultArgName", "arg");
        term29 = new Integer(568599855);
        term5506 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term5506, term5506.getClass(), "defaultWidth", 568599855);
        setIntField(term5506, term5506.getClass(), "defaultLeftPad", 1);
        setIntField(term5506, term5506.getClass(), "defaultDescPad", 3);
        setField(term5506, term5506.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5506, term5506.getClass(), "defaultNewLine", "\n");
        setField(term5506, term5506.getClass(), "defaultOptPrefix", "-");
        setField(term5506, term5506.getClass(), "defaultLongOptPrefix", "--");
        setField(term5506, term5506.getClass(), "defaultArgName", "arg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29;
        callMethod(klass, "setWidth", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term5506));
        assertTrue(recursiveEquals(term29, 568599855));
    }

};



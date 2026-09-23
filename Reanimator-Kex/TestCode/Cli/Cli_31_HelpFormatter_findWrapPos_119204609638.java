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

public class HelpFormatter_findWrapPos_119204609638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5707;
     Object term5751;
     Object term5753;

    public HelpFormatter_findWrapPos_119204609638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5707 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term5738 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term5707, term5707.getClass(), "defaultWidth", 74);
        setIntField(term5707, term5707.getClass(), "defaultLeftPad", 1);
        setIntField(term5707, term5707.getClass(), "defaultDescPad", 3);
        setField(term5707, term5707.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5707, term5707.getClass(), "defaultNewLine", "\n");
        setField(term5707, term5707.getClass(), "defaultOptPrefix", "-");
        setField(term5707, term5707.getClass(), "defaultLongOptPrefix", "--");
        setField(term5707, term5707.getClass(), "longOptSeparator", " ");
        setField(term5707, term5707.getClass(), "defaultArgName", "arg");
        setField(term5707, term5707.getClass(), "optionComparator", term5738);
        term5751 = new Integer(-157887805);
        term5753 = new Integer(1876565163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "onpbIeEKoi";
        args[1] = term5751;
        args[2] = term5753;
        callMethod(klass, "findWrapPos", argTypes, term5707, args);
    }

};



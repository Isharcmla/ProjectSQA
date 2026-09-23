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
import java.util.HashMap;

public class HelpFormatter_appendOptionGroup_174359486728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3084;
     Object term3113;
     Object term3145;

    public HelpFormatter_appendOptionGroup_174359486728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3084 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term3112 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term3084, term3084.getClass(), "defaultWidth", 74);
        setIntField(term3084, term3084.getClass(), "defaultLeftPad", 1);
        setIntField(term3084, term3084.getClass(), "defaultDescPad", 3);
        setField(term3084, term3084.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term3084, term3084.getClass(), "defaultNewLine", "\n");
        setField(term3084, term3084.getClass(), "defaultOptPrefix", "-");
        setField(term3084, term3084.getClass(), "defaultLongOptPrefix", "--");
        setField(term3084, term3084.getClass(), "defaultArgName", "arg");
        setField(term3084, term3084.getClass(), "optionComparator", term3112);
        term3113 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3126 = (byte[]) newByteArray(16);
        setField(term3113, term3113.getClass(), "toStringCache", "AijpHYOFuy");
        setField(term3113, term3113.getClass(), "value", term3126);
        setByteField(term3113, term3113.getClass(), "coder", (byte) 47);
        setIntField(term3113, term3113.getClass(), "count", 1622346318);
        HashMap term3146 = new HashMap();
        term3145 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term3145, term3145.getClass(), "optionMap", term3146);
        setField(term3145, term3145.getClass(), "selected", "SbAoxhfrkn");
        setBooleanField(term3145, term3145.getClass(), "required", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("org.apache.commons.cli.OptionGroup");
        Object[] args = new Object[2];
        args[0] = term3113;
        args[1] = term3145;
        callMethod(klass, "appendOptionGroup", argTypes, term3084, args);
    }

};



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
import java.util.HashMap;

public class HelpFormatter_appendOptionGroup_174359486726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2973;
     Object term3005;

    public HelpFormatter_appendOptionGroup_174359486726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2973 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2986 = (byte[]) newByteArray(16);
        setField(term2973, term2973.getClass(), "toStringCache", "AijpHYOFuy");
        setField(term2973, term2973.getClass(), "value", term2986);
        setByteField(term2973, term2973.getClass(), "coder", (byte) 47);
        setIntField(term2973, term2973.getClass(), "count", 1622346318);
        HashMap term3006 = new HashMap();
        term3005 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term3005, term3005.getClass(), "optionMap", term3006);
        setField(term3005, term3005.getClass(), "selected", "SbAoxhfrkn");
        setBooleanField(term3005, term3005.getClass(), "required", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("org.apache.commons.cli.OptionGroup");
        Object[] args = new Object[2];
        args[0] = term2973;
        args[1] = term3005;
        callMethod(klass, "appendOptionGroup", argTypes, null, args);
    }

};



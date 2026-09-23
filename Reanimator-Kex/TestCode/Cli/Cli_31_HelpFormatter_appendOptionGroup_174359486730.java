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

public class HelpFormatter_appendOptionGroup_174359486730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3308;
     Object term3340;
     Object term3372;

    public HelpFormatter_appendOptionGroup_174359486730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3308 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term3339 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term3308, term3308.getClass(), "defaultWidth", 74);
        setIntField(term3308, term3308.getClass(), "defaultLeftPad", 1);
        setIntField(term3308, term3308.getClass(), "defaultDescPad", 3);
        setField(term3308, term3308.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term3308, term3308.getClass(), "defaultNewLine", "\n");
        setField(term3308, term3308.getClass(), "defaultOptPrefix", "-");
        setField(term3308, term3308.getClass(), "defaultLongOptPrefix", "--");
        setField(term3308, term3308.getClass(), "longOptSeparator", " ");
        setField(term3308, term3308.getClass(), "defaultArgName", "arg");
        setField(term3308, term3308.getClass(), "optionComparator", term3339);
        term3340 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3353 = (byte[]) newByteArray(16);
        setField(term3340, term3340.getClass(), "toStringCache", "SbAoxhfrkn");
        setField(term3340, term3340.getClass(), "value", term3353);
        setByteField(term3340, term3340.getClass(), "coder", (byte) 47);
        setIntField(term3340, term3340.getClass(), "count", 1622346318);
        HashMap term3373 = new HashMap();
        term3372 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term3372, term3372.getClass(), "optionMap", term3373);
        setField(term3372, term3372.getClass(), "selected", "kuTXqwMtDB");
        setBooleanField(term3372, term3372.getClass(), "required", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("org.apache.commons.cli.OptionGroup");
        Object[] args = new Object[2];
        args[0] = term3340;
        args[1] = term3372;
        callMethod(klass, "appendOptionGroup", argTypes, term3308, args);
    }

};



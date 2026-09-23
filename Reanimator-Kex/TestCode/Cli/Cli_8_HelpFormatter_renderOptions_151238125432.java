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
import java.util.HashMap;
import java.util.ArrayList;

public class HelpFormatter_renderOptions_151238125432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4996;
     Object term5024;
     Object term5056;
     Object term5058;
     Object term5078;
     Object term5080;

    public HelpFormatter_renderOptions_151238125432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4996 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term4996, term4996.getClass(), "defaultWidth", 74);
        setIntField(term4996, term4996.getClass(), "defaultLeftPad", 1);
        setIntField(term4996, term4996.getClass(), "defaultDescPad", 3);
        setField(term4996, term4996.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term4996, term4996.getClass(), "defaultNewLine", "\n");
        setField(term4996, term4996.getClass(), "defaultOptPrefix", "-");
        setField(term4996, term4996.getClass(), "defaultLongOptPrefix", "--");
        setField(term4996, term4996.getClass(), "defaultArgName", "arg");
        term5024 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term5037 = (byte[]) newByteArray(16);
        setField(term5024, term5024.getClass(), "toStringCache", "nGKItKLYNC");
        setField(term5024, term5024.getClass(), "value", term5037);
        setByteField(term5024, term5024.getClass(), "coder", (byte) 89);
        setIntField(term5024, term5024.getClass(), "count", -1530420153);
        term5056 = new Integer(-469968304);
        HashMap term5059 = new HashMap();
        HashMap term5064 = new HashMap();
        ArrayList term5069 = new ArrayList();
        HashMap term5073 = new HashMap();
        term5058 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term5058, term5058.getClass(), "shortOpts", term5059);
        setField(term5058, term5058.getClass(), "longOpts", term5064);
        setField(term5058, term5058.getClass(), "requiredOpts", term5069);
        setField(term5058, term5058.getClass(), "optionGroups", term5073);
        term5078 = new Integer(-1145578966);
        term5080 = new Integer(679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.apache.commons.cli.Options");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term5024;
        args[1] = term5056;
        args[2] = term5058;
        args[3] = term5078;
        args[4] = term5080;
        callMethod(klass, "renderOptions", argTypes, term4996, args);
    }

};



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
import java.util.HashMap;
import java.util.ArrayList;

public class HelpFormatter_renderOptions_151238125434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5154;
     Object term5183;
     Object term5215;
     Object term5217;
     Object term5237;
     Object term5239;

    public HelpFormatter_renderOptions_151238125434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5154 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term5182 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term5154, term5154.getClass(), "defaultWidth", 74);
        setIntField(term5154, term5154.getClass(), "defaultLeftPad", 1);
        setIntField(term5154, term5154.getClass(), "defaultDescPad", 3);
        setField(term5154, term5154.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5154, term5154.getClass(), "defaultNewLine", "\n");
        setField(term5154, term5154.getClass(), "defaultOptPrefix", "-");
        setField(term5154, term5154.getClass(), "defaultLongOptPrefix", "--");
        setField(term5154, term5154.getClass(), "defaultArgName", "arg");
        setField(term5154, term5154.getClass(), "optionComparator", term5182);
        term5183 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term5196 = (byte[]) newByteArray(16);
        setField(term5183, term5183.getClass(), "toStringCache", "nGKItKLYNC");
        setField(term5183, term5183.getClass(), "value", term5196);
        setByteField(term5183, term5183.getClass(), "coder", (byte) 89);
        setIntField(term5183, term5183.getClass(), "count", -1530420153);
        term5215 = new Integer(-469968304);
        HashMap term5218 = new HashMap();
        HashMap term5223 = new HashMap();
        ArrayList term5228 = new ArrayList();
        HashMap term5232 = new HashMap();
        term5217 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term5217, term5217.getClass(), "shortOpts", term5218);
        setField(term5217, term5217.getClass(), "longOpts", term5223);
        setField(term5217, term5217.getClass(), "requiredOpts", term5228);
        setField(term5217, term5217.getClass(), "optionGroups", term5232);
        term5237 = new Integer(-1145578966);
        term5239 = new Integer(679763016);
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
        args[0] = term5183;
        args[1] = term5215;
        args[2] = term5217;
        args[3] = term5237;
        args[4] = term5239;
        callMethod(klass, "renderOptions", argTypes, term5154, args);
    }

};



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

public class HelpFormatter_renderOptions_151238125436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5445;
     Object term5477;
     Object term5509;
     Object term5511;
     Object term5531;
     Object term5533;

    public HelpFormatter_renderOptions_151238125436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5445 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term5476 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term5445, term5445.getClass(), "defaultWidth", 74);
        setIntField(term5445, term5445.getClass(), "defaultLeftPad", 1);
        setIntField(term5445, term5445.getClass(), "defaultDescPad", 3);
        setField(term5445, term5445.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5445, term5445.getClass(), "defaultNewLine", "\n");
        setField(term5445, term5445.getClass(), "defaultOptPrefix", "-");
        setField(term5445, term5445.getClass(), "defaultLongOptPrefix", "--");
        setField(term5445, term5445.getClass(), "longOptSeparator", " ");
        setField(term5445, term5445.getClass(), "defaultArgName", "arg");
        setField(term5445, term5445.getClass(), "optionComparator", term5476);
        term5477 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term5490 = (byte[]) newByteArray(16);
        setField(term5477, term5477.getClass(), "toStringCache", "UiUYnPrcCi");
        setField(term5477, term5477.getClass(), "value", term5490);
        setByteField(term5477, term5477.getClass(), "coder", (byte) 89);
        setIntField(term5477, term5477.getClass(), "count", -1530420153);
        term5509 = new Integer(-469968304);
        HashMap term5512 = new HashMap();
        HashMap term5517 = new HashMap();
        ArrayList term5522 = new ArrayList();
        HashMap term5526 = new HashMap();
        term5511 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term5511, term5511.getClass(), "shortOpts", term5512);
        setField(term5511, term5511.getClass(), "longOpts", term5517);
        setField(term5511, term5511.getClass(), "requiredOpts", term5522);
        setField(term5511, term5511.getClass(), "optionGroups", term5526);
        term5531 = new Integer(-1145578966);
        term5533 = new Integer(679763016);
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
        args[0] = term5477;
        args[1] = term5509;
        args[2] = term5511;
        args[3] = term5531;
        args[4] = term5533;
        callMethod(klass, "renderOptions", argTypes, term5445, args);
    }

};



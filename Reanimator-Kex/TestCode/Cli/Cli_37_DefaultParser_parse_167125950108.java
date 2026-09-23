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
import java.util.LinkedHashMap;

public class DefaultParser_parse_167125950108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374151;
     Object term374030;
     Object term373507;

    public DefaultParser_parse_167125950108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term374151 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term374183 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term374220 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term374151, term374151.getClass(), "options", null);
        setBooleanField(term374151, term374151.getClass(), "stopAtNonOption", false);
        setBooleanField(term374151, term374151.getClass(), "skipParsing", false);
        setField(term374151, term374151.getClass(), "currentOption", term374183);
        setField(term374151, term374151.getClass(), "expectedOpts", null);
        setField(term374151, term374151.getClass(), "cmd", term374220);
        setField(term374151, term374151.getClass(), "currentToken", null);
        LinkedHashMap term374280 = new LinkedHashMap();
        term374030 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term374112 = newInstance(Class.forName("java.util.Collections$UnmodifiableList"));
        setField(term374112, term374112.getClass(), "list", term374151);
        setField(term374030, term374030.getClass(), "requiredOpts", term374112);
        setField(term374030, term374030.getClass(), "optionGroups", term374280);
        term373507 = (Object[]) newArray("java.lang.String", 32);
        setElement(term373507, 0, "");
        setElement(term373507, 1, "");
        setElement(term373507, 2, "");
        setElement(term373507, 3, "");
        setElement(term373507, 4, "");
        setElement(term373507, 5, "");
        setElement(term373507, 6, "");
        setElement(term373507, 7, "");
        setElement(term373507, 8, "");
        setElement(term373507, 9, "");
        setElement(term373507, 10, "");
        setElement(term373507, 11, "");
        setElement(term373507, 12, "");
        setElement(term373507, 13, "");
        setElement(term373507, 14, "");
        setElement(term373507, 15, "");
        setElement(term373507, 16, "");
        setElement(term373507, 17, "");
        setElement(term373507, 18, "");
        setElement(term373507, 19, "");
        setElement(term373507, 20, "");
        setElement(term373507, 21, "");
        setElement(term373507, 22, "");
        setElement(term373507, 23, "");
        setElement(term373507, 24, "");
        setElement(term373507, 25, "");
        setElement(term373507, 26, "");
        setElement(term373507, 27, "");
        setElement(term373507, 28, "");
        setElement(term373507, 29, "");
        setElement(term373507, 30, "");
        setElement(term373507, 31, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term374030;
        args[1] = term373507;
        callMethod(klass, "parse", argTypes, term374151, args);
    }

};



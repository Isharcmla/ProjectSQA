package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class PeriodFormatterBuilder_appendSuffix_221140711175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35684;

    public PeriodFormatterBuilder_appendSuffix_221140711175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term35826 = new ArrayList();
        ArrayList term35736 = new ArrayList();
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add((Object)null);
        ((ArrayList) term35736).add("");
        ((ArrayList) term35736).add(term35826);
        term35684 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        setField(term35684, term35684.getClass(), "iElementPairs", term35736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "appendSuffix", argTypes, term35684, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



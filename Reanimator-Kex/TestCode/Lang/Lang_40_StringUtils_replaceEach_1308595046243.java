package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;

public class StringUtils_replaceEach_1308595046243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3596;
     Object term3693;
     Object term3766;
     Object term3768;

    public StringUtils_replaceEach_1308595046243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3596 = (Object[]) newArray("java.lang.String", 8);
        setElement(term3596, 0, "PtirvZmsGt");
        setElement(term3596, 1, "HWkpTmtlrc");
        setElement(term3596, 2, "hMmaoREuCK");
        setElement(term3596, 3, "VeDtgDzGAN");
        setElement(term3596, 4, "aWYOWZFyaX");
        setElement(term3596, 5, "BRIVNtfUWU");
        setElement(term3596, 6, "DbiCVtPPCT");
        setElement(term3596, 7, "WzFopsaDuG");
        term3693 = (Object[]) newArray("java.lang.String", 6);
        setElement(term3693, 0, "PapWxkhEWe");
        setElement(term3693, 1, "smnHEqRFRx");
        setElement(term3693, 2, "XYtryyobou");
        setElement(term3693, 3, "OYbzXylRWW");
        setElement(term3693, 4, "DSNsTGYXDF");
        setElement(term3693, 5, "sQvGcVjdEx");
        term3766 = new Boolean(true);
        term3768 = new Integer(-117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[3] = boolean.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = "HHmNoYxIGj";
        args[1] = term3596;
        args[2] = term3693;
        args[3] = term3766;
        args[4] = term3768;
        try {
            callMethod(klass, "replaceEach", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



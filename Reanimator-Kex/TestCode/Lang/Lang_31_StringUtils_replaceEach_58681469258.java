package org.apache.commons.lang3;

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
import java.lang.IllegalArgumentException;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;

public class StringUtils_replaceEach_58681469258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3670;
     Object term3767;
     Object term3840;
     Object term3842;

    public StringUtils_replaceEach_58681469258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3670 = (Object[]) newArray("java.lang.String", 8);
        setElement(term3670, 0, "VeDtgDzGAN");
        setElement(term3670, 1, "aWYOWZFyaX");
        setElement(term3670, 2, "BRIVNtfUWU");
        setElement(term3670, 3, "DbiCVtPPCT");
        setElement(term3670, 4, "WzFopsaDuG");
        setElement(term3670, 5, "PapWxkhEWe");
        setElement(term3670, 6, "smnHEqRFRx");
        setElement(term3670, 7, "XYtryyobou");
        term3767 = (Object[]) newArray("java.lang.String", 6);
        setElement(term3767, 0, "OYbzXylRWW");
        setElement(term3767, 1, "DSNsTGYXDF");
        setElement(term3767, 2, "sQvGcVjdEx");
        setElement(term3767, 3, "rLHAoqXgPh");
        setElement(term3767, 4, "zUlRdimJtU");
        setElement(term3767, 5, "vwbEQQNQrx");
        term3840 = new Boolean(true);
        term3842 = new Integer(865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[3] = boolean.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = "hMmaoREuCK";
        args[1] = term3670;
        args[2] = term3767;
        args[3] = term3840;
        args[4] = term3842;
        try {
            callMethod(klass, "replaceEach", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



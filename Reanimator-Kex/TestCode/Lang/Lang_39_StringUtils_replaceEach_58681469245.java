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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;

public class StringUtils_replaceEach_58681469245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3638;
     Object term3735;
     Object term3808;
     Object term3810;

    public StringUtils_replaceEach_58681469245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3638 = (Object[]) newArray("java.lang.String", 8);
        setElement(term3638, 0, "hMmaoREuCK");
        setElement(term3638, 1, "VeDtgDzGAN");
        setElement(term3638, 2, "aWYOWZFyaX");
        setElement(term3638, 3, "BRIVNtfUWU");
        setElement(term3638, 4, "DbiCVtPPCT");
        setElement(term3638, 5, "WzFopsaDuG");
        setElement(term3638, 6, "PapWxkhEWe");
        setElement(term3638, 7, "smnHEqRFRx");
        term3735 = (Object[]) newArray("java.lang.String", 6);
        setElement(term3735, 0, "XYtryyobou");
        setElement(term3735, 1, "OYbzXylRWW");
        setElement(term3735, 2, "DSNsTGYXDF");
        setElement(term3735, 3, "sQvGcVjdEx");
        setElement(term3735, 4, "rLHAoqXgPh");
        setElement(term3735, 5, "zUlRdimJtU");
        term3808 = new Boolean(true);
        term3810 = new Integer(-117576464);
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
        args[0] = "HWkpTmtlrc";
        args[1] = term3638;
        args[2] = term3735;
        args[3] = term3808;
        args[4] = term3810;
        try {
            callMethod(klass, "replaceEach", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



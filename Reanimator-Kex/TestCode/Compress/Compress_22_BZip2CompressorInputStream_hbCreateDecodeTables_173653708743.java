package org.apache.commons.compress.compressors.bzip2;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BZip2CompressorInputStream_hbCreateDecodeTables_173653708743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4690;
     Object term4694;
     Object term4702;
     Object term4710;
     Object term4713;
     Object term4715;
     Object term4717;

    public BZip2CompressorInputStream_hbCreateDecodeTables_173653708743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4690 = (int[]) newIntArray(3);
        setIntElement(term4690, 0, -82417507);
        setIntElement(term4690, 1, -511400358);
        setIntElement(term4690, 2, -742178468);
        term4694 = (int[]) newIntArray(7);
        setIntElement(term4694, 0, 694989162);
        setIntElement(term4694, 1, -65504209);
        setIntElement(term4694, 2, 1745199030);
        setIntElement(term4694, 3, -1440013173);
        setIntElement(term4694, 4, -288126597);
        setIntElement(term4694, 5, -218831961);
        setIntElement(term4694, 6, 826765055);
        term4702 = (int[]) newIntArray(7);
        setIntElement(term4702, 0, 1358117317);
        setIntElement(term4702, 1, 229989439);
        setIntElement(term4702, 2, -1620126913);
        setIntElement(term4702, 3, -1095121979);
        setIntElement(term4702, 4, -1674851914);
        setIntElement(term4702, 5, -1891353352);
        setIntElement(term4702, 6, 113007640);
        term4710 = (char[]) newCharArray(2);
        setCharElement(term4710, 0, 'C');
        setCharElement(term4710, 1, 'W');
        term4713 = new Integer(1782226794);
        term4715 = new Integer(1115327577);
        term4717 = new Integer(840704993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = Array.newInstance(char.class, 0).getClass();
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = term4690;
        args[1] = term4694;
        args[2] = term4702;
        args[3] = term4710;
        args[4] = term4713;
        args[5] = term4715;
        args[6] = term4717;
        try {
            callMethod(klass, "hbCreateDecodeTables", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



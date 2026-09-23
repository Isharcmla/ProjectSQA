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
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BZip2CompressorInputStream_hbCreateDecodeTables_173653708715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4677;
     Object term4681;
     Object term4689;
     Object term4697;
     Object term4700;
     Object term4702;
     Object term4704;

    public BZip2CompressorInputStream_hbCreateDecodeTables_173653708715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4677 = (int[]) newIntArray(3);
        setIntElement(term4677, 0, 657342039);
        setIntElement(term4677, 1, 1483999606);
        setIntElement(term4677, 2, 1871761182);
        term4681 = (int[]) newIntArray(7);
        setIntElement(term4681, 0, 233983728);
        setIntElement(term4681, 1, -1650132476);
        setIntElement(term4681, 2, 1719680265);
        setIntElement(term4681, 3, -1890898783);
        setIntElement(term4681, 4, 1357632911);
        setIntElement(term4681, 5, 1768195761);
        setIntElement(term4681, 6, -1382661134);
        term4689 = (int[]) newIntArray(7);
        setIntElement(term4689, 0, -1042022818);
        setIntElement(term4689, 1, 317372051);
        setIntElement(term4689, 2, 892170444);
        setIntElement(term4689, 3, -82417507);
        setIntElement(term4689, 4, -511400358);
        setIntElement(term4689, 5, -742178468);
        setIntElement(term4689, 6, 694989162);
        term4697 = (char[]) newCharArray(2);
        setCharElement(term4697, 0, 'C');
        setCharElement(term4697, 1, 'W');
        term4700 = new Integer(-65504209);
        term4702 = new Integer(1745199030);
        term4704 = new Integer(-1440013173);
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
        args[0] = term4677;
        args[1] = term4681;
        args[2] = term4689;
        args[3] = term4697;
        args[4] = term4700;
        args[5] = term4702;
        args[6] = term4704;
        callMethod(klass, "hbCreateDecodeTables", argTypes, null, args);
    }

};



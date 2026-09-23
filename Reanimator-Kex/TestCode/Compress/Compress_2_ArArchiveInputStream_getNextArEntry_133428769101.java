package org.apache.commons.compress.archivers.ar;

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
import java.io.IOException;
import static org.apache.commons.compress.archivers.ar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArArchiveInputStream_getNextArEntry_133428769101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118636;

    public ArArchiveInputStream_getNextArEntry_133428769101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118636 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term118764 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term118892 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term119020 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term119148 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term119276 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term119404 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term119532 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term119660 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term119788 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term119916 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term120044 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term120172 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term120300 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term120428 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term120556 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term120684 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term120812 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term120940 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term121068 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term121196 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term121324 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term121452 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term121580 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term121708 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term121836 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term121964 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term122092 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term122220 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term122348 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term122476 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term122604 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term122732 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term122860 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term122988 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term123116 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term123164 = newInstance(Class.forName("java.io.InputStream$1"));
        setLongField(term118636, term118636.getClass(), "offset", 0L);
        setField(term123116, term123116.getClass(), "input", term123164);
        setLongField(term123116, term123116.getClass(), "offset", 0L);
        setField(term122988, term122988.getClass(), "input", term123116);
        setLongField(term122988, term122988.getClass(), "offset", 0L);
        setField(term122860, term122860.getClass(), "input", term122988);
        setLongField(term122860, term122860.getClass(), "offset", 0L);
        setField(term122732, term122732.getClass(), "input", term122860);
        setLongField(term122732, term122732.getClass(), "offset", 0L);
        setField(term122604, term122604.getClass(), "input", term122732);
        setLongField(term122604, term122604.getClass(), "offset", 0L);
        setField(term122476, term122476.getClass(), "input", term122604);
        setLongField(term122476, term122476.getClass(), "offset", 0L);
        setField(term122348, term122348.getClass(), "input", term122476);
        setLongField(term122348, term122348.getClass(), "offset", 0L);
        setField(term122220, term122220.getClass(), "input", term122348);
        setLongField(term122220, term122220.getClass(), "offset", 0L);
        setField(term122092, term122092.getClass(), "input", term122220);
        setLongField(term122092, term122092.getClass(), "offset", 0L);
        setField(term121964, term121964.getClass(), "input", term122092);
        setLongField(term121964, term121964.getClass(), "offset", 0L);
        setField(term121836, term121836.getClass(), "input", term121964);
        setLongField(term121836, term121836.getClass(), "offset", 0L);
        setField(term121708, term121708.getClass(), "input", term121836);
        setLongField(term121708, term121708.getClass(), "offset", 0L);
        setField(term121580, term121580.getClass(), "input", term121708);
        setLongField(term121580, term121580.getClass(), "offset", 0L);
        setField(term121452, term121452.getClass(), "input", term121580);
        setLongField(term121452, term121452.getClass(), "offset", 0L);
        setField(term121324, term121324.getClass(), "input", term121452);
        setLongField(term121324, term121324.getClass(), "offset", 0L);
        setField(term121196, term121196.getClass(), "input", term121324);
        setLongField(term121196, term121196.getClass(), "offset", 0L);
        setField(term121068, term121068.getClass(), "input", term121196);
        setLongField(term121068, term121068.getClass(), "offset", 0L);
        setField(term120940, term120940.getClass(), "input", term121068);
        setLongField(term120940, term120940.getClass(), "offset", 0L);
        setField(term120812, term120812.getClass(), "input", term120940);
        setLongField(term120812, term120812.getClass(), "offset", 0L);
        setField(term120684, term120684.getClass(), "input", term120812);
        setLongField(term120684, term120684.getClass(), "offset", 0L);
        setField(term120556, term120556.getClass(), "input", term120684);
        setLongField(term120556, term120556.getClass(), "offset", 0L);
        setField(term120428, term120428.getClass(), "input", term120556);
        setLongField(term120428, term120428.getClass(), "offset", 0L);
        setField(term120300, term120300.getClass(), "input", term120428);
        setLongField(term120300, term120300.getClass(), "offset", 0L);
        setField(term120172, term120172.getClass(), "input", term120300);
        setLongField(term120172, term120172.getClass(), "offset", 0L);
        setField(term120044, term120044.getClass(), "input", term120172);
        setLongField(term120044, term120044.getClass(), "offset", 0L);
        setField(term119916, term119916.getClass(), "input", term120044);
        setLongField(term119916, term119916.getClass(), "offset", 0L);
        setField(term119788, term119788.getClass(), "input", term119916);
        setLongField(term119788, term119788.getClass(), "offset", 0L);
        setField(term119660, term119660.getClass(), "input", term119788);
        setLongField(term119660, term119660.getClass(), "offset", 0L);
        setField(term119532, term119532.getClass(), "input", term119660);
        setLongField(term119532, term119532.getClass(), "offset", 0L);
        setField(term119404, term119404.getClass(), "input", term119532);
        setLongField(term119404, term119404.getClass(), "offset", 0L);
        setField(term119276, term119276.getClass(), "input", term119404);
        setLongField(term119276, term119276.getClass(), "offset", 0L);
        setField(term119148, term119148.getClass(), "input", term119276);
        setLongField(term119148, term119148.getClass(), "offset", 0L);
        setField(term119020, term119020.getClass(), "input", term119148);
        setLongField(term119020, term119020.getClass(), "offset", 0L);
        setField(term118892, term118892.getClass(), "input", term119020);
        setLongField(term118892, term118892.getClass(), "offset", 0L);
        setField(term118764, term118764.getClass(), "input", term118892);
        setLongField(term118764, term118764.getClass(), "offset", 0L);
        setField(term118636, term118636.getClass(), "input", term118764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNextArEntry", argTypes, term118636, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};



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

public class ArArchiveInputStream_getNextArEntry_13342876997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112612;

    public ArArchiveInputStream_getNextArEntry_13342876997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112612 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term112740 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term112868 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term112996 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term113124 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term113252 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term113380 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term113508 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term113636 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term113764 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term113892 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term114020 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term114148 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term114276 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term114404 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term114532 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term114660 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term114788 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term114916 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term115044 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term115172 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term115300 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term115428 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term115556 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term115684 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term115812 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term115940 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term116068 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term116196 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term116324 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term116452 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term116580 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term116708 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term116836 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term116964 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term117092 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        Object term117140 = newInstance(Class.forName("java.io.InputStream$1"));
        setLongField(term112612, term112612.getClass(), "offset", 0L);
        setField(term117092, term117092.getClass(), "input", term117140);
        setLongField(term117092, term117092.getClass(), "offset", 0L);
        setField(term116964, term116964.getClass(), "input", term117092);
        setLongField(term116964, term116964.getClass(), "offset", 0L);
        setField(term116836, term116836.getClass(), "input", term116964);
        setLongField(term116836, term116836.getClass(), "offset", 0L);
        setField(term116708, term116708.getClass(), "input", term116836);
        setLongField(term116708, term116708.getClass(), "offset", 0L);
        setField(term116580, term116580.getClass(), "input", term116708);
        setLongField(term116580, term116580.getClass(), "offset", 0L);
        setField(term116452, term116452.getClass(), "input", term116580);
        setLongField(term116452, term116452.getClass(), "offset", 0L);
        setField(term116324, term116324.getClass(), "input", term116452);
        setLongField(term116324, term116324.getClass(), "offset", 0L);
        setField(term116196, term116196.getClass(), "input", term116324);
        setLongField(term116196, term116196.getClass(), "offset", 0L);
        setField(term116068, term116068.getClass(), "input", term116196);
        setLongField(term116068, term116068.getClass(), "offset", 0L);
        setField(term115940, term115940.getClass(), "input", term116068);
        setLongField(term115940, term115940.getClass(), "offset", 0L);
        setField(term115812, term115812.getClass(), "input", term115940);
        setLongField(term115812, term115812.getClass(), "offset", 0L);
        setField(term115684, term115684.getClass(), "input", term115812);
        setLongField(term115684, term115684.getClass(), "offset", 0L);
        setField(term115556, term115556.getClass(), "input", term115684);
        setLongField(term115556, term115556.getClass(), "offset", 0L);
        setField(term115428, term115428.getClass(), "input", term115556);
        setLongField(term115428, term115428.getClass(), "offset", 0L);
        setField(term115300, term115300.getClass(), "input", term115428);
        setLongField(term115300, term115300.getClass(), "offset", 0L);
        setField(term115172, term115172.getClass(), "input", term115300);
        setLongField(term115172, term115172.getClass(), "offset", 0L);
        setField(term115044, term115044.getClass(), "input", term115172);
        setLongField(term115044, term115044.getClass(), "offset", 0L);
        setField(term114916, term114916.getClass(), "input", term115044);
        setLongField(term114916, term114916.getClass(), "offset", 0L);
        setField(term114788, term114788.getClass(), "input", term114916);
        setLongField(term114788, term114788.getClass(), "offset", 0L);
        setField(term114660, term114660.getClass(), "input", term114788);
        setLongField(term114660, term114660.getClass(), "offset", 0L);
        setField(term114532, term114532.getClass(), "input", term114660);
        setLongField(term114532, term114532.getClass(), "offset", 0L);
        setField(term114404, term114404.getClass(), "input", term114532);
        setLongField(term114404, term114404.getClass(), "offset", 0L);
        setField(term114276, term114276.getClass(), "input", term114404);
        setLongField(term114276, term114276.getClass(), "offset", 0L);
        setField(term114148, term114148.getClass(), "input", term114276);
        setLongField(term114148, term114148.getClass(), "offset", 0L);
        setField(term114020, term114020.getClass(), "input", term114148);
        setLongField(term114020, term114020.getClass(), "offset", 0L);
        setField(term113892, term113892.getClass(), "input", term114020);
        setLongField(term113892, term113892.getClass(), "offset", 0L);
        setField(term113764, term113764.getClass(), "input", term113892);
        setLongField(term113764, term113764.getClass(), "offset", 0L);
        setField(term113636, term113636.getClass(), "input", term113764);
        setLongField(term113636, term113636.getClass(), "offset", 0L);
        setField(term113508, term113508.getClass(), "input", term113636);
        setLongField(term113508, term113508.getClass(), "offset", 0L);
        setField(term113380, term113380.getClass(), "input", term113508);
        setLongField(term113380, term113380.getClass(), "offset", 0L);
        setField(term113252, term113252.getClass(), "input", term113380);
        setLongField(term113252, term113252.getClass(), "offset", 0L);
        setField(term113124, term113124.getClass(), "input", term113252);
        setLongField(term113124, term113124.getClass(), "offset", 0L);
        setField(term112996, term112996.getClass(), "input", term113124);
        setLongField(term112996, term112996.getClass(), "offset", 0L);
        setField(term112868, term112868.getClass(), "input", term112996);
        setLongField(term112868, term112868.getClass(), "offset", 0L);
        setField(term112740, term112740.getClass(), "input", term112868);
        setLongField(term112740, term112740.getClass(), "offset", 0L);
        setField(term112612, term112612.getClass(), "input", term112740);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNextArEntry", argTypes, term112612, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};



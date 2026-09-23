package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.utils.EqualityUtils.*;
import java.lang.Object;

public class IOUtils_skip_1761958321121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277342;
     Object term284762;

    public IOUtils_skip_1761958321121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277342 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term277512 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term277682 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term277852 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term278022 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term278192 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term278362 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term278532 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term278702 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term278872 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term279042 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term279212 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term279382 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term279552 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term279722 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term279854 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setLongField(term277342, term277342.getClass(), "max", 1459387043552579584L);
        setLongField(term277512, term277512.getClass(), "max", 1441372653633032192L);
        setLongField(term277682, term277682.getClass(), "max", -1441372668666204417L);
        setLongField(term277852, term277852.getClass(), "max", 1495415333765271552L);
        setLongField(term278022, term278022.getClass(), "max", -1571471269625480193L);
        setLongField(term278192, term278192.getClass(), "max", 5430956553386371010L);
        setLongField(term278362, term278362.getClass(), "max", -1441433811843960962L);
        setLongField(term278532, term278532.getClass(), "max", 1441372653633032192L);
        setLongField(term278702, term278702.getClass(), "max", 8488542348579582017L);
        setLongField(term278872, term278872.getClass(), "max", 8488466255099064318L);
        setLongField(term279042, term279042.getClass(), "max", -8488463765400998089L);
        setLongField(term279212, term279212.getClass(), "max", 1441372653633032192L);
        setLongField(term279382, term279382.getClass(), "max", 1441372653633032192L);
        setLongField(term279552, term279552.getClass(), "max", 1441372653633032192L);
        setLongField(term279722, term279722.getClass(), "max", 1441372653633065264L);
        setField(term279722, term279722.getClass(), "in", term279854);
        setField(term279552, term279552.getClass(), "in", term279722);
        setField(term279382, term279382.getClass(), "in", term279552);
        setField(term279212, term279212.getClass(), "in", term279382);
        setField(term279042, term279042.getClass(), "in", term279212);
        setField(term278872, term278872.getClass(), "in", term279042);
        setField(term278702, term278702.getClass(), "in", term278872);
        setField(term278532, term278532.getClass(), "in", term278702);
        setField(term278362, term278362.getClass(), "in", term278532);
        setField(term278192, term278192.getClass(), "in", term278362);
        setField(term278022, term278022.getClass(), "in", term278192);
        setField(term277852, term277852.getClass(), "in", term278022);
        setField(term277682, term277682.getClass(), "in", term277852);
        setField(term277512, term277512.getClass(), "in", term277682);
        setField(term277342, term277342.getClass(), "in", term277512);
        term284762 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term284763 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term284764 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term284765 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term284766 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        setField(term284766, term284766.getClass(), "in", null);
        setLongField(term284766, term284766.getClass(), "max", -1571471269625480193L);
        setLongField(term284766, term284766.getClass(), "pos", 0L);
        setField(term284766, term284766.getClass(), "this$0", null);
        setField(term284765, term284765.getClass(), "in", term284766);
        setLongField(term284765, term284765.getClass(), "max", 1495415333765271552L);
        setLongField(term284765, term284765.getClass(), "pos", 0L);
        setField(term284765, term284765.getClass(), "this$0", null);
        setField(term284764, term284764.getClass(), "in", term284765);
        setLongField(term284764, term284764.getClass(), "max", -1441372668666204417L);
        setLongField(term284764, term284764.getClass(), "pos", 0L);
        setField(term284764, term284764.getClass(), "this$0", null);
        setField(term284763, term284763.getClass(), "in", term284764);
        setLongField(term284763, term284763.getClass(), "max", 1441372653633032192L);
        setLongField(term284763, term284763.getClass(), "pos", 0L);
        setField(term284763, term284763.getClass(), "this$0", null);
        setField(term284762, term284762.getClass(), "in", term284763);
        setLongField(term284762, term284762.getClass(), "max", 1459387043552579584L);
        setLongField(term284762, term284762.getClass(), "pos", 0L);
        setField(term284762, term284762.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term277342;
        args[1] = 32L;
        Object retValue = callMethod(klass, "skip", argTypes, null, args);
        assertTrue(recursiveEquals(term277342, term284762));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};



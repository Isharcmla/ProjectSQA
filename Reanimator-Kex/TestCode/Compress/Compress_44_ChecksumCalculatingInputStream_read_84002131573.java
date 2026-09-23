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
import org.tukaani.xz.XZIOException;
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ChecksumCalculatingInputStream_read_84002131573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18453;

    public ChecksumCalculatingInputStream_read_84002131573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18453 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term18587 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term18721 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term18855 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term18989 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term19123 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term19257 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term19391 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term19525 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term19659 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term19793 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term19927 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term20061 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term20195 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term20329 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term20463 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term20597 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term20731 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term20865 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term20999 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term21133 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term21267 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term21401 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term21535 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term21669 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term21803 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term21937 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term22071 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term22205 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term22339 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term22407 = newInstance(Class.forName("org.tukaani.xz.DeltaInputStream"));
        setField(term22339, term22339.getClass(), "in", term22407);
        setField(term22205, term22205.getClass(), "in", term22339);
        setField(term22071, term22071.getClass(), "in", term22205);
        setField(term21937, term21937.getClass(), "in", term22071);
        setField(term21803, term21803.getClass(), "in", term21937);
        setField(term21669, term21669.getClass(), "in", term21803);
        setField(term21535, term21535.getClass(), "in", term21669);
        setField(term21401, term21401.getClass(), "in", term21535);
        setField(term21267, term21267.getClass(), "in", term21401);
        setField(term21133, term21133.getClass(), "in", term21267);
        setField(term20999, term20999.getClass(), "in", term21133);
        setField(term20865, term20865.getClass(), "in", term20999);
        setField(term20731, term20731.getClass(), "in", term20865);
        setField(term20597, term20597.getClass(), "in", term20731);
        setField(term20463, term20463.getClass(), "in", term20597);
        setField(term20329, term20329.getClass(), "in", term20463);
        setField(term20195, term20195.getClass(), "in", term20329);
        setField(term20061, term20061.getClass(), "in", term20195);
        setField(term19927, term19927.getClass(), "in", term20061);
        setField(term19793, term19793.getClass(), "in", term19927);
        setField(term19659, term19659.getClass(), "in", term19793);
        setField(term19525, term19525.getClass(), "in", term19659);
        setField(term19391, term19391.getClass(), "in", term19525);
        setField(term19257, term19257.getClass(), "in", term19391);
        setField(term19123, term19123.getClass(), "in", term19257);
        setField(term18989, term18989.getClass(), "in", term19123);
        setField(term18855, term18855.getClass(), "in", term18989);
        setField(term18721, term18721.getClass(), "in", term18855);
        setField(term18587, term18587.getClass(), "in", term18721);
        setField(term18453, term18453.getClass(), "in", term18587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term18453, args);
            assertTrue(false);
        }
        catch (XZIOException e) {
        }

    }

};



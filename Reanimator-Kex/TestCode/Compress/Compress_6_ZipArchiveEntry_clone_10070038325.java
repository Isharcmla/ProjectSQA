package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.lang.String;

public class ZipArchiveEntry_clone_10070038325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1635;

    public ZipArchiveEntry_clone_10070038325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term1640 = new LinkedHashMap();
        Class<? extends Object> term1776 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term1775 = ((Class) term1776).getDeclaredField((String) "MICROSECONDS");
        ((Field) term1775).setAccessible(true);
        Object enum6 = ((Field) term1775).get((Object) null);
        Class<? extends Object> term1984 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term1983 = ((Class) term1984).getDeclaredField((String) "HOURS");
        ((Field) term1983).setAccessible(true);
        Object enum7 = ((Field) term1983).get((Object) null);
        term1635 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term1661 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term1687 = newInstance(Class.forName("java.time.Instant"));
        Object term1702 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term1704 = newInstance(Class.forName("java.time.Instant"));
        Object term1719 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term1738 = newInstance(Class.forName("java.time.Instant"));
        byte[] term1758 = (byte[]) newByteArray(3);
        setIntField(term1635, term1635.getClass(), "method", -1);
        setIntField(term1635, term1635.getClass(), "internalAttributes", -1339778481);
        setIntField(term1635, term1635.getClass(), "platform", 1725571209);
        setLongField(term1635, term1635.getClass(), "externalAttributes", 6811161968424632369L);
        setField(term1635, term1635.getClass(), "extraFields", term1640);
        setField(term1635, term1635.getClass(), "name", "");
        setLongField(term1635, term1635.getClass(), "xdostime", -1L);
        setField(term1661, term1661.getClass(), "unit", enum6);
        setLongField(term1661, term1661.getClass(), "value", -7237588299778557629L);
        setLongField(term1687, term1687.getClass(), "seconds", 1429041851L);
        setIntField(term1687, term1687.getClass(), "nanos", 389000000);
        setField(term1661, term1661.getClass(), "instant", term1687);
        setField(term1661, term1661.getClass(), "valueAsString", "oVcInYnLWB");
        setField(term1635, term1635.getClass(), "mtime", term1661);
        setField(term1702, term1702.getClass(), "unit", enum6);
        setLongField(term1702, term1702.getClass(), "value", 6967924379644551255L);
        setLongField(term1704, term1704.getClass(), "seconds", 1495375463L);
        setIntField(term1704, term1704.getClass(), "nanos", 288000000);
        setField(term1702, term1702.getClass(), "instant", term1704);
        setField(term1702, term1702.getClass(), "valueAsString", "aJlieCFVtF");
        setField(term1635, term1635.getClass(), "atime", term1702);
        setField(term1719, term1719.getClass(), "unit", enum7);
        setLongField(term1719, term1719.getClass(), "value", -2813493605142626659L);
        setLongField(term1738, term1738.getClass(), "seconds", 1645852034L);
        setIntField(term1738, term1738.getClass(), "nanos", 896000000);
        setField(term1719, term1719.getClass(), "instant", term1738);
        setField(term1719, term1719.getClass(), "valueAsString", "ZiaGIbnzTs");
        setField(term1635, term1635.getClass(), "ctime", term1719);
        setLongField(term1635, term1635.getClass(), "crc", -1L);
        setLongField(term1635, term1635.getClass(), "size", -1L);
        setLongField(term1635, term1635.getClass(), "csize", -1L);
        setIntField(term1635, term1635.getClass(), "flag", -522618178);
        setByteElement(term1758, 0, (byte) 79);
        setByteElement(term1758, 1, (byte) -119);
        setByteElement(term1758, 2, (byte) -66);
        setField(term1635, term1635.getClass(), "extra", term1758);
        setField(term1635, term1635.getClass(), "comment", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term1635, args);
    }

};



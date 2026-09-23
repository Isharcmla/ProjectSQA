package org.apache.commons.compress.archivers.dump;

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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714613;
     Object term715271;

    public DumpArchiveInputStream_readDirectoryEntry_482549166430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term714661 = new HashMap();
        term714613 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term714175 = (byte[]) newByteArray(0);
        Object term714887 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term715023 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term715147 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        byte[] term714316 = (byte[]) newByteArray(0);
        byte[] term714182 = (byte[]) newByteArray(128);
        setField(term714613, term714613.getClass(), "names", term714661);
        setField(term714613, term714613.getClass(), "blockBuffer", term714175);
        setIntField(term714887, term714887.getClass(), "readOffset", 41);
        setIntField(term714887, term714887.getClass(), "blockSize", 41);
        setBooleanField(term715023, term715023.getClass(), "hasHitEOF", false);
        setBooleanField(term715023, term715023.getClass(), "isClosed", false);
        setLongField(term715023, term715023.getClass(), "entryOffset", 585468227509813224L);
        setLongField(term715023, term715023.getClass(), "entrySize", 585468227509813228L);
        setField(term715023, term715023.getClass(), "active", term715147);
        setField(term715023, term715023.getClass(), "readBuf", term714316);
        setField(term714887, term714887.getClass(), "in", term715023);
        setBooleanField(term714887, term714887.getClass(), "isCompressed", true);
        setIntField(term714887, term714887.getClass(), "currBlkIdx", -1);
        setByteElement(term714182, 0, (byte) -20);
        setByteElement(term714182, 1, (byte) -20);
        setByteElement(term714182, 2, (byte) -20);
        setByteElement(term714182, 3, (byte) -20);
        setByteElement(term714182, 4, (byte) -20);
        setByteElement(term714182, 5, (byte) -20);
        setByteElement(term714182, 6, (byte) -20);
        setByteElement(term714182, 7, (byte) -20);
        setByteElement(term714182, 8, (byte) -20);
        setByteElement(term714182, 9, (byte) -20);
        setByteElement(term714182, 10, (byte) -20);
        setByteElement(term714182, 11, (byte) -20);
        setByteElement(term714182, 12, (byte) -20);
        setByteElement(term714182, 13, (byte) -20);
        setByteElement(term714182, 14, (byte) -20);
        setByteElement(term714182, 15, (byte) -20);
        setByteElement(term714182, 16, (byte) -20);
        setByteElement(term714182, 17, (byte) -20);
        setByteElement(term714182, 18, (byte) -20);
        setByteElement(term714182, 19, (byte) -20);
        setByteElement(term714182, 20, (byte) -20);
        setByteElement(term714182, 21, (byte) -20);
        setByteElement(term714182, 22, (byte) -20);
        setByteElement(term714182, 23, (byte) -20);
        setByteElement(term714182, 24, (byte) -20);
        setByteElement(term714182, 25, (byte) -20);
        setByteElement(term714182, 26, (byte) -20);
        setByteElement(term714182, 27, (byte) -20);
        setByteElement(term714182, 28, (byte) -20);
        setByteElement(term714182, 29, (byte) -20);
        setByteElement(term714182, 30, (byte) -20);
        setByteElement(term714182, 31, (byte) -20);
        setByteElement(term714182, 32, (byte) -20);
        setByteElement(term714182, 33, (byte) -20);
        setByteElement(term714182, 34, (byte) -20);
        setByteElement(term714182, 35, (byte) -20);
        setByteElement(term714182, 36, (byte) -20);
        setByteElement(term714182, 37, (byte) -20);
        setByteElement(term714182, 38, (byte) -20);
        setByteElement(term714182, 39, (byte) -20);
        setByteElement(term714182, 40, (byte) -20);
        setByteElement(term714182, 41, (byte) -20);
        setByteElement(term714182, 42, (byte) -20);
        setByteElement(term714182, 43, (byte) -20);
        setByteElement(term714182, 44, (byte) -20);
        setByteElement(term714182, 45, (byte) -20);
        setByteElement(term714182, 46, (byte) -20);
        setByteElement(term714182, 47, (byte) -20);
        setByteElement(term714182, 48, (byte) -20);
        setByteElement(term714182, 49, (byte) -20);
        setByteElement(term714182, 50, (byte) -20);
        setByteElement(term714182, 51, (byte) -20);
        setByteElement(term714182, 52, (byte) -20);
        setByteElement(term714182, 53, (byte) -20);
        setByteElement(term714182, 54, (byte) -20);
        setByteElement(term714182, 55, (byte) -20);
        setByteElement(term714182, 56, (byte) -20);
        setByteElement(term714182, 57, (byte) -20);
        setByteElement(term714182, 58, (byte) -20);
        setByteElement(term714182, 59, (byte) -20);
        setByteElement(term714182, 60, (byte) -20);
        setByteElement(term714182, 61, (byte) -20);
        setByteElement(term714182, 62, (byte) -20);
        setByteElement(term714182, 63, (byte) -20);
        setByteElement(term714182, 64, (byte) -20);
        setByteElement(term714182, 65, (byte) -20);
        setByteElement(term714182, 66, (byte) -20);
        setByteElement(term714182, 67, (byte) -20);
        setByteElement(term714182, 68, (byte) -20);
        setByteElement(term714182, 69, (byte) -20);
        setByteElement(term714182, 70, (byte) -20);
        setByteElement(term714182, 71, (byte) -20);
        setByteElement(term714182, 72, (byte) -20);
        setByteElement(term714182, 73, (byte) -20);
        setByteElement(term714182, 74, (byte) -20);
        setByteElement(term714182, 75, (byte) -20);
        setByteElement(term714182, 76, (byte) -20);
        setByteElement(term714182, 77, (byte) -20);
        setByteElement(term714182, 78, (byte) -20);
        setByteElement(term714182, 79, (byte) -20);
        setByteElement(term714182, 80, (byte) -20);
        setByteElement(term714182, 81, (byte) -20);
        setByteElement(term714182, 82, (byte) -20);
        setByteElement(term714182, 83, (byte) -20);
        setByteElement(term714182, 84, (byte) -20);
        setByteElement(term714182, 85, (byte) -20);
        setByteElement(term714182, 86, (byte) -20);
        setByteElement(term714182, 87, (byte) -20);
        setByteElement(term714182, 88, (byte) -20);
        setByteElement(term714182, 89, (byte) -20);
        setByteElement(term714182, 90, (byte) -20);
        setByteElement(term714182, 91, (byte) -20);
        setByteElement(term714182, 92, (byte) -20);
        setByteElement(term714182, 93, (byte) -20);
        setByteElement(term714182, 94, (byte) -20);
        setByteElement(term714182, 95, (byte) -20);
        setByteElement(term714182, 96, (byte) -20);
        setByteElement(term714182, 97, (byte) -20);
        setByteElement(term714182, 98, (byte) -20);
        setByteElement(term714182, 99, (byte) -20);
        setByteElement(term714182, 100, (byte) -20);
        setByteElement(term714182, 101, (byte) -20);
        setByteElement(term714182, 102, (byte) -20);
        setByteElement(term714182, 103, (byte) -20);
        setByteElement(term714182, 104, (byte) -20);
        setByteElement(term714182, 105, (byte) -20);
        setByteElement(term714182, 106, (byte) -20);
        setByteElement(term714182, 107, (byte) -20);
        setByteElement(term714182, 108, (byte) -20);
        setByteElement(term714182, 109, (byte) -20);
        setByteElement(term714182, 110, (byte) -20);
        setByteElement(term714182, 111, (byte) -20);
        setByteElement(term714182, 112, (byte) -20);
        setByteElement(term714182, 113, (byte) -20);
        setByteElement(term714182, 114, (byte) -20);
        setByteElement(term714182, 115, (byte) -20);
        setByteElement(term714182, 116, (byte) -20);
        setByteElement(term714182, 117, (byte) -20);
        setByteElement(term714182, 118, (byte) -20);
        setByteElement(term714182, 119, (byte) -20);
        setByteElement(term714182, 120, (byte) -20);
        setByteElement(term714182, 121, (byte) -20);
        setByteElement(term714182, 122, (byte) -20);
        setByteElement(term714182, 123, (byte) -20);
        setByteElement(term714182, 124, (byte) -20);
        setByteElement(term714182, 125, (byte) -20);
        setByteElement(term714182, 126, (byte) -20);
        setByteElement(term714182, 127, (byte) -20);
        setField(term714887, term714887.getClass(), "blockBuffer", term714182);
        setField(term714613, term714613.getClass(), "raw", term714887);
        Class<? extends Object> term718698 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term718697 = ((Class) term718698).getDeclaredField((String) "ADDR");
        ((Field) term718697).setAccessible(true);
        Object enum100 = ((Field) term718697).get((Object) null);
        term715271 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term715431 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term715271, term715271.getClass(), "size", 0L);
        setIntField(term715431, term715431.getClass(), "ino", 0);
        setField(term715431, term715431.getClass(), "type", enum100);
        setIntField(term715431, term715431.getClass(), "count", 0);
        setField(term715271, term715271.getClass(), "header", term715431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term715271;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term714613, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


